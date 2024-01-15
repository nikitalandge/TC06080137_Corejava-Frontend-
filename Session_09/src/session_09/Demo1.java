package session_09;

public class Demo1 {
	
	public static void main(String args[])
	{
		try {
			int a,b,c=0;
			
			a= Integer.parseInt(args[0]);
			b= Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("div = "+c);
		}
//		catch(ArithmeticException e) {
//			System.out.println("Denominator should not be 0");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Enter atleast 2 parameters");
//		}
//		catch(NumberFormatException e) {
//			System.out.println("Enter only int data");
//		}
		catch(Exception e){
			//e.printStackTrace();	
			
			if(e instanceof ArithmeticException) {
				System.out.println("Denominator should not be 0");
			}
			else if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Enter atleast 2 parameters");
			}
			else if(e instanceof NumberFormatException) {
				System.out.println("Enter only int data");
			}
			else {
				System.out.println("Exception...!");
			}
		}
	}

}
