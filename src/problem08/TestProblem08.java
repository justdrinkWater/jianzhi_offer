package problem08;

public class TestProblem08 {
	public static void main(String[] args) {
		// int[] arr={};//空数组
		// int[] arr={1,1,1,1,0,1,1,1};//左、中、右三个值相等
		int[] arr = { 3, 4, 5, 1, 2, 3 };// 一般的
		System.out.println(new GetMinNumber(arr).getMinNumber());
	}
}
