package array.Assignment;

public class Rotate_Array_left_shift {

	public static void main(String[] args) {
	        
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int k = 3; 
        int n = arr.length;
        
        k=k%n;
        
        int brr[]= new int[n];
        int idx =0;
        
        for(int i=k;i<n;i++ ) {
        	brr[idx]=arr[i];
        	idx++;
        	
        }
        
        for(int i =0;i<k;i++) {
        	brr[idx]=arr[i];
        	idx++;
        }
        for(int ele : brr) {
            System.out.print(ele + " ");
        }

	}

}
