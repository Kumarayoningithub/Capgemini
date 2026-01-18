package array.twoDArray.Assignments;

public class SumOfDiagonalElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        
	        int n1 = arr.length;
	        int  n2 = arr[0].length;
	        
	        int sum=0;
	        for(int i =0;i<n1;i++) {
	        	for(int j =0;j<n2;j++) {
	        		if(i==j) {
	        			sum=sum+arr[i][j];
	        		}
	        	}
	        }
	        
	        System.out.println(sum);

	}

}
