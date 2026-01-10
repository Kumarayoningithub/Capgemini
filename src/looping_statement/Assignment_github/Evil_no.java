package looping_statement.Assignment_github;

public class Evil_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 45;
		
		int binary = 0;
		int place = 1;
		int count = 0;
		
		while(n!=0) {
			int rem = n%2;
			if(rem==1) {
				count++;
			}
			binary = binary + rem*place;
			place = place*10;
			
			n=n/2;
			
		}
		
		
		System.out.println(binary);
		if(count%2==0)
		System.out.println("evil no");
		
		

	}

}
