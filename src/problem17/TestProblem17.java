package problem17;

public class TestProblem17 {
	public static void main(String[] args) {
		ListNode node1_1 = new ListNode();
		node1_1.m_nValue = 1;
		ListNode node1_2 = new ListNode();
		node1_2.m_nValue = 3;
		ListNode node1_3 = new ListNode();
		node1_3.m_nValue = 4;
		ListNode node1_4 = new ListNode();
		node1_4.m_nValue = 6;
		ListNode node1_5 = new ListNode();
		node1_5.m_nValue = 8;
		ListNode node1_6 = new ListNode();
		node1_6.m_nValue = 9;
		node1_1.m_pNext = node1_2;
		node1_2.m_pNext = node1_3;
		node1_3.m_pNext = node1_4;
		node1_4.m_pNext = node1_5;
		node1_5.m_pNext = node1_6;
		node1_6.m_pNext = null;
		
		ListNode node2_1 = new ListNode();
		node2_1.m_nValue = 3;
		ListNode node2_2 = new ListNode();
		node2_2.m_nValue = 5;
		ListNode node2_3 = new ListNode();
		node2_3.m_nValue = 9;
		ListNode node2_4 = new ListNode();
		node2_4.m_nValue = 11;
		ListNode node2_5 = new ListNode();
		node2_5.m_nValue = 19;
		node2_1.m_pNext = node2_2;
		node2_2.m_pNext = node2_3;
		node2_3.m_pNext = node2_4;
		node2_4.m_pNext = null;
		/**
		 *注意：测试第二个的时候需要把第一个注释掉，否则在第一个执行完之后，
		 *已经合并两个链表了
		 * 
		 */
		//测试两个都不为空
/*		ListNode pM = new CombineOrderedLinkedList().combine(node1_1,node2_1);
		while(pM != null){
			System.out.println(pM.m_nValue);
			pM = pM.m_pNext;
		}*/
		//测试一个为空
		ListNode pM2 = new CombineOrderedLinkedList().combine(null, node2_1);
		while(pM2 != null){
			System.out.println(pM2.m_nValue);
			pM2 = pM2.m_pNext;
		}
		
	}

}
