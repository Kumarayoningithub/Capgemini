package looping_statement.whileloop;

public class Program4 {

	public static void main(String[] args) {
		
		 int n =9;
		 
		 int sq = n*n;
		 
		 int sum = 0;
		 
		 while(sq!=0) {
			 sum =sum+  sq %10;
			 sq=sq/10;
		 }
		 
		 if(n== sum) {
			 System.out.println("neon no");
		 }else {
			 System.out.println("not a neon no");
		 }
		
		

	}

}
