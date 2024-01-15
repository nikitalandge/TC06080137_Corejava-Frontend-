package session_07;  // garbage collector

public class GCDemo {

   @SuppressWarnings("deprecation")
   @Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Object Garbage collectd");
	}

public static void main(String args[])
   {
	   GCDemo g1= new GCDemo();
	   GCDemo g2= new GCDemo();
	   GCDemo g3= new GCDemo();
	   
	   // ... start execute
	   g1=null;
	   g2=null;
	   g3=null;
	   System.gc();
	   //Runtime.getRuntime.gc();
   }
}