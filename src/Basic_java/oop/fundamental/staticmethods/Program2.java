package oop.fundamental.staticmethods;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("Program2 Main start");
		
        Program1.test1();// only test1() will execute from program1 no main method will execute from program1
        
        System.out.println(Program1.i);
        
        System.out.println("Program2 Main end");
}

}
