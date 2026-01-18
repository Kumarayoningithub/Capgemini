//package array.Assignment;
//
//public class IncrementLargeIntegerStoredInArray {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int arr[]= {1,2,3};
//		
//		int n = arr.length;
//		
//		
//		int sum = arr[n-1] + 1;
//		
//		System.out.println(sum);
//		
//		int count = String.valueOf(sum).length();
//		
//		if(count>9) {
//			
//			int k = sum;
//			int a=0;
//			int b =0;
//			int brr[]= new int [n+1];
//			 
//			for(int i =0;i<n-1;i++) {
//				brr[i]=arr[i];
//			}
//			
//			while(k!=0) {
//				a=k%10;
//				b=k/10;
//			}
//			
//			brr[n]=b;
//			brr[n+1]=a;
//			
//			for(int i =0;i<n;i++) {
//			System.out.println(brr[i]);
//			
//			}
//			
//			
//		}else if(count<9){
//			arr[n-1]=sum;
//			for(int i =0;i<n;i++) {
//				System.out.println(arr[i]);
//			}
//		}
//		
//		
//		
//		
//		
//
//	}
//
//}

package array.Assignment;

public class IncrementLargeIntegerStoredInArray {

    public static void main(String[] args) {
        
        int arr[] = {1,2,3};
        int n = arr.length;

        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] < 9) {
                arr[i]++;
                print(arr);
                return;
            }
            else {
                arr[i] = 0;
            }
        }
        
        int brr[] = new int[n + 1];
        brr[0] = 1;
        print(brr);
    }
    
    static void print(int[] a) {
        for(int x : a) System.out.print(x + " ");
    }
}

