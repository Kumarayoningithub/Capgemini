package array.Assignment;

public class SegregateZeros_Ones {

	public static void main(String[] args) {
		
		int arr[]= {0,1,0,1,0,0,1,1,0};
		int n = arr.length;
		
		//int count0=0;
		int count1=0;
		for(int i = 0;i<n;i++) {
			if(arr[i]==1) count1++;
			
			
		}
		
		int k =0;
		
		for(int i =0;i<count1;i++)
		
	       arr[i]=1;
		
		for(int i = count1 ; i<n;i++) {
			arr[i]=0;
		}
		
		
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
		
		

	}

}
