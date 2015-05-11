package problem03;

public class TestProblem03 {
	public static void main(String[] args) {
		int[][] arr = { 
						{ 1, 2, 8, 9 }, 
						{ 2, 4, 9, 12 }, 
						{ 4, 7, 10, 13 },
						{ 6, 8, 11, 15 } 
					   };
		System.out
				.println(new FindNumberFromArray(arr, 4, 4, 16).findNumber());
	}

}
