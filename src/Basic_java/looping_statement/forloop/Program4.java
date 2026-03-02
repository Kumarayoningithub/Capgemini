package looping_statement.forloop;

public class Program4 {

	public static void main(String[] args) {
		
		// outer loop row
		// inner loop column 
		
		for(int i =1;i<=3;i++) {
			
			for(int j = 1; j<=3;j++) {
				if(i==j) 
					System.out.print("* ");
				else 
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
