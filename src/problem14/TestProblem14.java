package problem14;

public class TestProblem14 {
	public static void main(String[] args) {
		int[] a = {1,3,4,2,5,2,54,6,7,87,8,4,3,2};
		new EvenfrontOdd().order(a);
		for(int b : a){
			System.out.println(b);
		}
	}
}
