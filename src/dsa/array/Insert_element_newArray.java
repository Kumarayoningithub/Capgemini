package dsa.array;

public class Insert_element_newArray {

	public static void main(String[] args) {
		
		int a[] = {10, 30, 8, 6, 7, 2,0};
        int n = a.length;
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        
        
        int idx = 2;
        int ele=40;
       
        
       
        for(int i =n-1;i>0;i--) {
        	
        	a[i]=a[i-1];
        	
        	
        }
        
        a[idx]=ele;
        
        
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        

	}

}
