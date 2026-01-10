package operators.logicaloperators;

public class Program2 {

	public static void main(String[] args) {
		System.out.println(false || true || false);
		
		int a = 6;
		
		//System.out.println(a> 10 || ++a> 10);
		
		System.out.println(a<10 || ++a> 10);// check 1st one and 1st one is true then give output true np check further thats why 6 will not increase
		
		
		
		System.out.println(a);
		/*
		  Logical Or operator will check only for true
		  condition and terminates the program for single
		  true value
		 */

	}

}
