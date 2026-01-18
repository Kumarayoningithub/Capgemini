package array;

public class Array_max_min {
	
	
	public static void max_min_diff(int []arr) {
           int n = arr.length;
		
		int max = Integer.MIN_VALUE;
		int min= Integer.MAX_VALUE;
		
		
		for(int i= 0;i<n; i++) {
			
			if(max>arr[i]) {
				max=arr[i];
			}
			if(min<arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println(max-min);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {5,6,3,2,1};
		
		max_min_diff(arr);
//		int n = arr.length;
//		
//		int max = Integer.MIN_VALUE;
//		int min= Integer.MAX_VALUE;
//		
//		
//		for(int i= 0;i<n; i++) {
//			
//			if(max>arr[i]) {
//				max=arr[i];
//			}
//			if(min<arr[i]) {
//				min=arr[i];
//			}
//		}
//		
//		System.out.println(max-min);

	}

}
