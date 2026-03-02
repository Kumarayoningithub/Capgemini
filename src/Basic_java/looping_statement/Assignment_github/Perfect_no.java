package looping_statement.Assignment_github;

public class Perfect_no {

	public static void main(String[] args) {
		
		int n = 7;
		int ans = 0;
		
		for(int i =1;i<n;i++) {
			
			if(n%i==0) {
				ans=ans+i;
			}
			
		}
		
		if(n==ans)
			System.out.println("yes it is ");
			

	}

}
