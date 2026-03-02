
package exam;
import java.util.*;
public class RotateArray {

	    public static void main(String[] args) {
	        int[] nums = {1,2,3,4,5,6,7};
	        int k = 3;

	        int n = nums.length;
	        k = k % n;

	        int[] result = new int[n];

	        int idx = 0;
	        for (int i = n - k; i < n; i++) {
	            result[idx] = nums[i];
	            idx++;
	        }

	        for (int i = 0; i < n - k; i++) {
	            result[idx] = nums[i];
	            idx++;
	        }

	        for (int i = 0; i < n; i++) {
	            System.out.print(result[i] + " ");
	        }
	    }
	



}




