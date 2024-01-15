package session_08;   //inner class

import session_08.Outer2.Inner;

public class Outer {
	
	private static int no=100;
	
	public class Inner{
		int no=1000;
		
		public void getNo()
		{
			int no=10;
			System.out.println("NO="+no);
			System.out.println("Inner no="+this.no);
			System.out.println("Outer no="+Outer.no);
		}
	}
//	public void get()
//	{
//		Inner i=new Inner();
//		i.getNo();
//	}
	
	public static void main(String args[]) {
		
		Outer o= new Outer(); //Member_inner_class 
//		Inner i=o.new Inner();
//		i.getNo();
//		o.get();
		
		Inner i = new Outer().new Inner();
		i.getNo();
		
			
	}

}
