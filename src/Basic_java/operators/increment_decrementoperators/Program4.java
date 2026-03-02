package operators.increment_decrementoperators;

public class Program4 {

	public static void main(String[] args) {
		
		 int a = 3;
		 int b = ++a + a++;
		 int c = b++ + ++a + b++ + a++;
		 
		System.out.println(a);// 7
		
		System.out.println(b);// 10
		
		System.out.println(c);// 29
		
		
		

	}

}
