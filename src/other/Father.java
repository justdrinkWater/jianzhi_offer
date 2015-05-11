package other;

interface I{
	 void text();
}
public class Father {
	public Father(int i) {
	}
	public Father() {
	}	
	int i;
	{
		System.out.println("父类的非静态代码块");
	}
	static {
		System.out.println("父类的静态代码块");
	}
	public static void text() {
	}

}
