package problem13;

public class TestProblem13 {
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
		pHead.m_pNext = node1;
		node1.m_pNext = node2;
		node2.m_pNext = node3;
		node3.m_pNext = node4;
		node4.m_pNext = null;
		DeleteListNodeInO1 dlni1 = new DeleteListNodeInO1();
		//输入的是空
		//dlni1.deleteNode(null, node1);
		//删除的节点在中间
		//dlni1.deleteNode(pHead, node3);
		//删除的是普通尾结点
		dlni1.deleteNode(pHead, node4);
		//删除的是只有一个结点
		ListNode pHead1 = new ListNode();
		pHead1.m_Value = 1;
		pHead1.m_pNext = null;
		dlni1.deleteNode(pHead1, pHead1);
	}

}
