package shadowing_multilevel;

public class B3  extends B2{
     int b = 30;
     
     public void display() {
    	 System.out.println(b); // access own class
    	 System.out.println(super.b);// access B2 class 
    	 
    	 System.out.println(((B1)this).b);
     }
     
     public void display1() {
    	 
    	System.out.println("b3 method");
    	
    	super.display1();
    	
    	((B1)this).display12();
    	
    	}
     public static void main(String[] args) {
		B3 b3 = new B3();
		//b3.display();
		
		
		b3.display1();
		b3.display12();
	}
}
