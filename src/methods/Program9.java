package methods;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		*****
//		** **
//		*   *
		
		
		
		
		
		int n= 4;
		  
		for(int i = n;i>=1;i--) {
			
			for(int j = 1;j<=2*n-1;j++) {
				
				if(i>=j || i+j>=2*n) {
					
					
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
