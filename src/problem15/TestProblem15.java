package problem15;


public class TestProblem15 {
	public static void main(String[] args) {
		//测试
		ListNode pHead = new ListNode();
		ListNode node1 = new ListNode();
		node1.m_Value = 1;
		ListNode node2 = new ListNode();
		node2.m_Value = 2;
		ListNode node3 = new ListNode();
		node3.m_Value = 3;
		ListNode node4 = new ListNode();
		node4.m_Value = 4;
		pHead.m_Next = node1;
		node1.m_Next = node2;
		node2.m_Next = node3;
		node3.m_Next = node4;
		node4.m_Next = null;
		//正常的
		System.out.println(new FindKthToTail().findKthToTail(pHead, 2).m_Value);
		//输入的是空指针
		new FindKthToTail().findKthToTail(null, 1);
		//输入的k大于链表的长度
		new FindKthToTail().findKthToTail(pHead, 10);
	}

}
