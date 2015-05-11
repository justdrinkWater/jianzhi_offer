package problem07;

import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下， 
 * 请实现它的两个函数appendTail和deleteHead，分别
 * 完成在队列尾部插入结点和在队列头部删除结点的功能
 * 
 * @author sunwei
 *
 */
public class RealiseQueueByTwoStack<T> {
	private Stack<T> stack1;
	private Stack<T> stack2;
	private int size = 0;

	public RealiseQueueByTwoStack() {
		stack1 = new Stack<T>();
		stack2 = new Stack<T>();
	}

	// 在队列尾部插入结点
	public boolean appendTail(T value) {
		stack1.push(value);
		size++;
		return true;
	}

	// 在队列头部删除结点
	public T deleteHead() {
		if (stack2.size() <= 0) {
			//stack2没有数据
			while (stack1.size() > 0) {
				stack2.push(stack1.pop());
			}
		}
		if (stack2.size() == 0)
			throw new RuntimeException("queue is empty");
		T head = stack2.pop();
		//返回原样
		while (stack2.size() > 0) {
			stack1.push(stack2.pop());
		}
		return head;
	}

}
