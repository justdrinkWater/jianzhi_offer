package problem07;

public class TestProblem7 {
	public static void main(String[] args) {
		RealiseQueueByTwoStack<Integer> rqbt = new RealiseQueueByTwoStack<Integer>();
		rqbt.appendTail(1);
		rqbt.appendTail(2);
		rqbt.appendTail(3);
		rqbt.appendTail(4);
		System.out.println(rqbt.deleteHead());
		System.out.println(rqbt.deleteHead());
		System.out.println(rqbt.deleteHead());
	}

}
