package session_09;
//exception handling

public class Demo {
	
	public static void getMsg()
	{
		msg();
	}
	public static float msg()
	{
		return(10/0);
	}
	public static void main(String arg[]) {
		getMsg();
		//msg();
	}

}
