package other;

public class Son extends Father{

	{
		System.out.println("子类的非静态代码块");
	}
	static {
		System.out.println("子类的静态代码块");
	}
	static Son s = new Son();

	public Son() {
		System.out.println("子类的构造函数");
	}

}
