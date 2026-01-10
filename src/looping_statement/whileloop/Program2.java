package looping_statement.whileloop;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1863;
		System.out.println(num);
		
		
		   // num= num/10;
		
		 int rev=0; // 3681
		    
		
		while(num!=0) {
			
			rev = num%10 + rev * 10; 
	
			
			 num= num/10;
			
		}
		
		 System.out.println(rev);

	}

}
