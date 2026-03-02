package exam;

//Given an array nums, return an array where each element is the 
//product of all other elements.
//
//Example:
//Input: [1,2,3,4]
//Output: [24,12,8,6]
//(Submit the program)


public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4};
		
		int n = arr.length;
		
		int [] ans = new int [n];
		
		
		for (int i = 0; i < n; i++) {
            int product = 1;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product = product *  arr[j];
                }
            }

            ans[i] = product;
        }
		
		for(int ele: ans) {
			System.out.print(ele+" ");
		}

		

	}

}





