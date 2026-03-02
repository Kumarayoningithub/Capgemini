package oop.fundamental.non_static;

public class Program5 {
	
	int  a = 10;
	static String s = "Hi";
	

	public static void main(String[] args) {
		
		Program5 obj1 = new Program5();
		
		obj1.a=100;
		obj1.s="hello";
		
		Program5 obj2 = new Program5();
		  System.out.println(obj2.a); 
		  /// still print 10;
		  System.out.println(obj2.s); // print hello

	}

}
