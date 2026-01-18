package array.Assignment;

public class Count_Occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {1,2,3,4,1,2,3,4,5,1,2,3,4,5,5};
		
		int n = arr.length;
		
		boolean [] flag = new boolean[n];
		
		for(int i =0;i<n;i++) {
			
			
			
			if(flag[i]==true) continue;
			
			int count =1;
			
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					flag[j]=true;
					
				}
			}
			
			System.out.println(arr[i]+":"+count+"times");
			
		}
		
		

	}

}
