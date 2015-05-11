package problem04;

public class TestProblem04 {
	public static void main(String[] args) {
		String str = "We are happy.";
		char[] ch = new ReplaceBlank(str).replace();
		for(char a : ch)
			System.out.print(a);
	}

}
