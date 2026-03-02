package dsa.array;

public class DeleteElement_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// input int a[] = {10, 60, 20, 40, 30};
		
		
		// output --> {10,60,20,30,0};
		
		
		int a[] = {10, 60, 20, 40, 30};
        int n = a.length;
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        
        int idx = 3;

        for(int i = idx; i < n - 1; i++) {
            a[i] = a[i + 1];
        }

        a[n - 1] = 0;
        
        
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
      
        
        
        
        
        

	}

}
