package array.twoDArray.Assignments;

public class IdentityMatrix {

	public static void main(String[] args) {
		
		int[][] arr = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        
	        int n1 = arr.length;
	        
	        int  n2 = arr[0].length;
	        
	        for(int i = 0; i<n1;i++) {
	        	for(int j =0;j<n2;j++) {
	        		if(i==j) {
	        		   if(	arr[i][j]!=1) {
	        			   System.out.println("not identity");
	        			  return;
	        		   }
	        		}else {
	        			if(arr[i][j]!=0) {
	        				System.out.println("not identity");
	        				return;
	        			}
	        		}
	        	}
	        }
	        
	        System.out.println("identity");
	        
	        
	        
	        

	}

}
