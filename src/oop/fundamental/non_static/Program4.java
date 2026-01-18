package oop.fundamental.non_static;

public class Program4 {
	
	int i = 3;
	
	static String s = "Hello";
	

	public static void main(String[] args) {
		
		Program4 obj1 = new Program4();// only non static variable will present 
		Program4 obj2 = new Program4();
		
		
		
		
        System.out.println();
        
        
        
        System.out.println(obj1==obj2);// false;
        
        
        System.out.println(obj1.s== obj1.s);
        
        
        
        System.out.println(obj1.i); // to access non static variable
        System.out.println(Program4.s);// to access static variable
        
        System.out.println(obj1.s);// we can access this but its not recomended
        
        
        
        
        
	}

}
