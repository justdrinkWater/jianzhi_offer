package problem21;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小
 *  元素min函数。在该栈中，调用min push pop 的时间复杂度都是O（1）
 * 
 * @author sunwei
 *
 */
public class StackWithMin {
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> min_stack = new Stack<Integer>();

	public void push(Integer data) {
		stack.push(data);
		if (min_stack.size() == 0 || data < min_stack.peek())
			min_stack.push(data);
		else
			min_stack.push(min_stack.peek());
	}

	public void pop() {
		stack.pop();
		min_stack.pop();
	}

	public Integer getMin() {
		return min_stack.peek();
	}

}
