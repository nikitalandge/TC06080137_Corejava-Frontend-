package session_07;   //clone method

public class Employee implements Cloneable {
	
	private int EmpId;
	private String empname;
	
	public Employee(int EmpId,String empname) {
		super();
		this.EmpId=EmpId;
		this.empname=empname;
	
	}
//	@override
	public String toString()
	{
		return "Employee = [EmpID = " + EmpId +" EmpName = "+ empname + " "+ "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public static void main(String args[])
			throws CloneNotSupportedException  {
		
		Employee e1=new Employee(111,"rahul");
		System.out.println("e1="+e1.EmpId+" "+e1.empname);
		
		Employee e2=new Employee(111,"rahul");
		System.out.println("e2="+e2.EmpId+" "+e2.empname);
		
	}
}
