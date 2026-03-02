package looping_statement.forloop;

public class Program2 {

	public static void main(String[] args) {
		
		int n = 98769;

		if (n == 1) {
		    System.out.println("No prime no composite");
		} else {
		    boolean isPrime = true;

		    for (int i = 2; i <= Math.sqrt(n); i++) {
		        if (n % i == 0) {
		            isPrime = false;
		            break;
		        }
		    }

		    if (isPrime) {
		        System.out.println("Prime Number");
		    } else {
		        System.out.println("Not Prime Number");
		    }
		}


	}

}
