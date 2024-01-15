package session_5;

public class D extends C {
	public D() {
		super();
		System.out.println("child default");
	}
	public D(int a) {
		super(10);
		System.out.println("Parent parameterized");
	}
	public static void main(String args[])
	{
		D d=new D();
		D d1=new D(10);
	}

}
