package looping_statement.whileloop;

public class Perfect_number {

	public static void main(String[] args) {
		//int n = 6;
		//int sum = 0;
		//int i = 1;

//		while (i <= n / 2) {   // check only up to half of n
//		    if (n % i == 0) {
//		        sum += i;
//		    }
//		    i++;
//		}
//
//		if (sum == n) {
//		    System.out.println("Perfect Number");
//		} else {
//		    System.out.println("Not a Perfect Number");
//		}
		int num = 6;
		int i =1;
		
		while(i < num) {
			if(num%i==0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
