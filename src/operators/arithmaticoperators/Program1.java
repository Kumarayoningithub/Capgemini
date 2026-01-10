package operators.arithmaticoperators;

public class Program1 {
	
	// Arithmetic operator
	
	// PROPERTY
	
	/*
	 * Every operator will have precedence and 
	 * Associativity 
	 * 
	 * Every operator return value and type of the value
	 */

	public static void main(String[] args) {
		// ADDITION
		// normal , concatenation
		int a = 10;
		int b = 20;
		
		
	
		System.out.println(10+20);
		System.out.println(a+b);
		
		System.out.println(""+10+10);
		
		System.out.println(10+20+"hello"+100);
		
		// operator presedence
		
		System.out.println(10+30*2);
		System.out.println(10/30*2);
		System.out.println(5/2);// int/ int = int
		System.out.println(5/2.0);// int/double = double
		
		
		System.out.println('A'+'B');
		
		
		char c =126;
		System.out.println(c);
		
		char z = 65 ;
		System.out.println(z);
		
		
		char y = 'A'+'a'; // here 65+ 97 = then it convert to symbol 
		System.out.println(y);
		
		
		

	}

}
