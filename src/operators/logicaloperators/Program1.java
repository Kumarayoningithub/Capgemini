package operators.logicaloperators;

public class Program1 {
	
	// logical AND

	public static void main(String[] args) {
		
		
		System.out.println(true && false && true);
		
		int a = 5;
		
		//System.out.println(a>10 && ++a>a); 5>10 false so next condition will not check
		
		//System.out.println(a<10 && ++a>a);
		
		System.out.println(a<10 && ++a<a); // 1st one is true but 2nd one is false --> give false but a is incremented to 6
		
		System.out.println(a);
		
		
		/*
		 Logical And operator checks for false value
		 and will get terminate for single false value
		 
		 * */
		
		

	}

}
