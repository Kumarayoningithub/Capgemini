package dsa.array;

public class Largest_Smallest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 30, 8, 6, 7, 2};
        int n = a.length;
        
        int max = Integer.MIN_VALUE;
        
        int min = Integer.MAX_VALUE;
        		
        
        for(int i =0;i<n;i++) {
        	if(a[i]>max) {
        		max=a[i];
        	}
        	if(a[i]<min) {
        		min=a[i];
        	}
        }
        
        int smx= Integer.MIN_VALUE;
        int smin = Integer.MAX_VALUE;
        
        for(int i =0;i<n;i++) {
        	
        	if(a[i]>smx && a[i]<max) {
        		smx=a[i];
        	}
        	
        	if(a[i]<smin && a[i]>min) {
        		smin=a[i];
        	}
        	
        }
        
        
        
        
        System.out.println(max);
        System.out.println(min);
        System.out.println(smx);
        System.out.println(smin);

	}

}
