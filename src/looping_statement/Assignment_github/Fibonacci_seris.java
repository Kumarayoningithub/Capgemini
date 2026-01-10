package looping_statement.Assignment_github;

public class Fibonacci_seris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 1 2 3 5 8
		
		int n = 7;
		
		int s = 1;
		int s2 = 1;
		System.out.println(s);
		System.out.println(s2);
		for(int i = 3;i<=n;i++) {
			
			int res = s+s2;
			System.out.println(res);
			s=s2;
			s2=res;
			
			
		}

	}

}
