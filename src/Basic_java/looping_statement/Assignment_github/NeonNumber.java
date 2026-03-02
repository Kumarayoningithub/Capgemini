package looping_statement.Assignment_github;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 9;
		int sq = n*n;
		
		int sum=0;
		
		while(sq!=0) {
			int ld = sq%10;
			sum = sum+ld;
			
			sq=sq/10;
			
		}
		
		if(sum==n)
		System.out.println("it is neon no");
		
		

	}

}
