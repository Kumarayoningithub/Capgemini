package dsa.array;

public class Rotate_element_right {
	public static void  reverse(int arr[],int i , int j ) {
		while(i<=j) {
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
    public static void main(String[] args) {
    	int a[] = {10, 60, 20, 40 , 30};
    	
    	
    	// make it to --> 40,30,10,60, 20  (left shift)
    	
    	// make it to --> 20,40,30, 10,60  (right shift)
    	
        int n = a.length;
        
        int k = 2;
        
        
        k=k%n;
        
        
      
//    reverse(a,0,n-k-1);
//    reverse(a,n-k,n-1 );
//    reverse(a,0,n-1);
//    
//    
//    
//    
//    for(int i = 0; i < n; i++) {
//        System.out.print(a[i] + " ");
//    }
//    System.out.println();
    
    
    reverse(a, 0, k-1);
    reverse(a, k, n-1);
    reverse(a, 0, n-1);


    for(int i = 0; i < n; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println();
        
        
        
        
        
        
        
        
        
        
        
	}
}
