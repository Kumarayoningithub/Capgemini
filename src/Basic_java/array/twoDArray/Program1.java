package array.twoDArray;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = {{10,20,9},{8,15,6},{12,13,17}};
		int n = arr.length;
		int m = arr[0].length;
		
		
		for(int i=0;i<n;i++ ) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
