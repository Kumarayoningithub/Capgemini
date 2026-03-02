package looping_statement.Assignment_github;

public class decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45;
		int place = 1;
		int binary =0;
	
		
		while(n!=0) {
			
			int rem = n%2;
			binary = binary + rem*place;
			place =place * 10;
			n=n/2;
			
			
			
		}
		System.out.println(binary);

	}

}
