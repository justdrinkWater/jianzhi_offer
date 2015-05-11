package problem05;

public class TestProblem05 {
	public static void main(String[] args) {
		ListNode node1 = new ListNode();
		node1.p_data = 1;
		ListNode node2 = new ListNode();
		node2.p_data = 2;
		ListNode node3 = new ListNode();
		node3.p_data = 3;
		ListNode node4 = new ListNode();
		node4.p_data = 4;
		ListNode node5 = new ListNode();
		node5.p_data = 5;
		ListNode node6 = new ListNode();
		node6.p_data = 6;
		ListNode node7 = new ListNode();
		node7.p_data = 7;
		ListNode node8 = new ListNode();
		node8.p_data = 8;
		ListNode node9 = new ListNode();
		node9.p_data = 9;
		node1.p_next = node2;
		node2.p_next = node3;
		node3.p_next = node4;
		node4.p_next = node5;
		node5.p_next = node6;
		node6.p_next = node7;
		node7.p_next = node8;
		node8.p_next = node9;
		node9.p_next = null;
		new PrintListReverse().print(node1);

	}

}
