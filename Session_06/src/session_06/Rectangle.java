package session_06;

public class Rectangle extends Shape{
	private  int l,b;
	
	public Rectangle(int l ,int b) {
		this.l=l;
		this.b=b;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (l * b);
	}

}
