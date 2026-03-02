package looping_statement.whileloop;

public class Automorphic_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n = 5;
//		
//		int sq = n*n;
//		
//		int ans = sq %10;
//		
//		if(ans == n) {
//			System.out.println("automorphic ");
//		}else {
//			System.out.println("not ");
//		}
		
		
		
		int n = 25;
		int sq = n * n;
		int temp = n;

		while (temp > 0) {
		    if (temp % 10 != sq % 10) {
		        System.out.println("Not Automorphic");
		        return;
		    }
		    temp /= 10;
		    sq /= 10;
		}
		System.out.println("Automorphic");


	}

}
