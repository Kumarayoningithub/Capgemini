package dsa.searching;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 23;
		
		int arr[]= {76,998,77,989,35,23};
		int n = arr.length;
		boolean flag = false;
		
		for(int i =0;i<n;i++) {
			if(arr[i]==k) {
				flag = true;
				System.out.println("found at index"+" "+i);
				break;
			}
		}
		if(flag== false)
		System.out.println("not found");
		
		

	}

}
