package program_variable;

public class Program3 {
	
	// global variable
	static int i=100;
   // only for declaration purpose
	public static void main(String[] args) {
		
         // local variable;
		int a = 10;
		System.out.println(a);
		a=20;
		System.out.println(a);
		//int i =45; //check on home
		System.out.println(i);// came from global variable
		
		
	}

}
