package array.twoDArray;

public class Program2 {

	public static void main(String[] args) {
		int [][] arr = {
				
				{7,9}, {4,2}
				
				     };
		
		
		
		System.out.println(arr[0]);// print reference
		
		
		int [][] b = {
				{1,2}, {3,1}
		};
		
		
		int [][] c =new int [2][2];
		
		for(int i =0;i<c.length;i++) {
			for(int j =0;j<c[0].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
