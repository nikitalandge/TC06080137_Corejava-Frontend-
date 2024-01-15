package session_08;  //method local inner class

public class Outer1 {
	
	private int i=10;
	
	public void get()
	{
		class Inner
		{
			int no=111;
			
			public void get()
			{
				System.out.println("No="+no);
			}
		}
		Inner i=new Inner();
		i.get();
	}

	public static void main(String args[]) {
		
		Outer1 o= new Outer1();
		o.get();
		
	}
}

//can i write main method in inner class?
//can we access inner method directly through command prompt 