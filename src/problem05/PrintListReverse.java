package problem05;

class ListNode {
	int p_data;
	ListNode p_next;
}
/**
 * 输入一个链表的头结点，从尾到头反过来打印每个节点的值
 * @author sunwei
 *
 */
public class PrintListReverse {
	public void print(ListNode p_node) {
		if (p_node != null) {
			if (p_node.p_next != null)
				print(p_node.p_next);
			System.out.print(p_node.p_data + "\t");
		}else{
			throw new RuntimeException("输入链表为空！！");
		}
	}
}
