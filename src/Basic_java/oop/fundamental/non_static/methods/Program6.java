package oop.fundamental.non_static.methods;

public class Program6 {

	public static void main(String[] args) {
		//demo(); ---> give the error so we need to create object and access it\
		
		Program6 obj1 = new Program6();
		
		obj1.demo();// now we can access it by create object

	}
	
	public void demo() {
		System.out.println("Demo");
	}

}
