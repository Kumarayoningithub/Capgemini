package looping_statement.Assignment_github;

public class Box_Toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
		
		
		for(int i = 1; i*i<=100; i++) {
			 int openbox = i*i;
			 System.out.println(openbox+ "stays open");
			 count++;
		}
		
		System.out.println("the  no of open box is "+ count);

	}

}
