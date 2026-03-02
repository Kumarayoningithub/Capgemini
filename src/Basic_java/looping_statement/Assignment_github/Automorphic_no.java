package looping_statement.Assignment_github;

public class Automorphic_no {
	public static void main (String []args) {
		
		
		
		
		int n = 76;
		int sq = n * n;

		int temp = n;
		
		boolean flag = true;

		while(temp != 0) {
		    if(temp % 10 != sq % 10) {
		        flag = false;
		        break;
		    }
		    temp /= 10;
		    sq /= 10;
		}
		
		
		

		if(flag)
		    System.out.println(n + " is Automorphic");
		else
		    System.out.println(n + " is NOT Automorphic");

	}

}
