package problem16;

public class TestProblem16 {
	public static void main(String[] args) {
		ListNode node1 = new ListNode();
		node1.m_nKey = 1;
		ListNode node2 = new ListNode();
		node2.m_nKey = 2;
		ListNode node3 = new ListNode();
		node3.m_nKey = 3;
		ListNode node4 = new ListNode();
		node4.m_nKey = 4;
		ListNode node5 = new ListNode();
		node5.m_nKey = 5;
		ListNode node6 = new ListNode();
		node6.m_nKey = 6;

		node1.m_pNext = node2;
		node2.m_pNext = node3;
		node3.m_pNext = node4;
		node4.m_pNext = node5;
		node5.m_pNext = node6;
		node6.m_pNext = null;
		
		ListNode newHeadNode = new ConvertLinkedList(node1).convert();
		while(newHeadNode!= null){
			System.out.println(newHeadNode.m_nKey);
			newHeadNode = newHeadNode.m_pNext;
		}
	}

}
