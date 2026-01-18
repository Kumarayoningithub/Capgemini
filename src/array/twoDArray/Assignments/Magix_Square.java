package array.twoDArray.Assignments;

public class Magix_Square {

	public static void main(String[] args) {
		
		 int[][] arr = {
		            {2, 7, 6},
		            {9, 5, 1},
		            {4, 3, 8}
		        };
		        
		        int n = arr.length;
		        
		        
		        int primarysum=0;
		        for(int i =0;i<n;i++) {
		        	primarysum=primarysum+arr[i][i];
		        }
		        
		        int secondarysum=0;
		        
		        for(int i =0;i<n;i++) {
		        	secondarysum=secondarysum+arr[i][n-1-i];
		        }
		        
		        if(primarysum != secondarysum) {
		            System.out.println("Not a Magic Matrix");
		            return;
		        }	
		        
		        for(int i=0;i<n;i++) {
		        	int rowsum=0;
		        	for(int j =0;j<n;j++) {
		        		rowsum=rowsum+arr[i][j];
		        	}
		        	if(primarysum != rowsum) {
			            System.out.println("Not a Magic Matrix");
			            return;
			        }
		        	
		        }
		        
		        
		        for(int i=0;i<n;i++) {
		        	int colsum=0;
		        	for(int j =0;j<n;j++) {
		        		colsum=colsum+arr[j][i];
		        	}
		        	if(colsum != primarysum) {
		                System.out.println("Not a Magic Matrix");
		                return;
		            }
		        }
		        
	        
	        
	     
	        System.out.println("Magic Matrix");
		        
	}

	}


