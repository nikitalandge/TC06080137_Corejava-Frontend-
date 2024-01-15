import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
//		int no=10;
//		Integer i= new Integer(no); //boxing -> primitive to wrapper class
//		
//		int a=i.intValue(); //unboxing -> wrapper to primitive
//		
//		int b=100;
//		Integer m=b; //auto-boxing
//		int c=m; //auto-unboxing
		
		List<Integer>l=new ArrayList<Integer>();//generic version of vector(datatype specified)
//		List l=new ArrayList<Integer>();//non-generic version of vector(mixed datatype)

		l.add(10);
	//	l.add("ABC");
		l.add(null);
		l.add(10);
		l.add(56);
		l.add(89);
		
		l.add(2,31);
		System.out.println(l);
		
		l.remove(3);
		System.out.println(l);

		System.out.println(l.contains(100));
		
		List l1 = Collections.synchronizedList(l);
		//System.out.println(l1);

		
}
}