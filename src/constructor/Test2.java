package constructor;

//int a[]=[3,6,7];
//[3]
//[3,6]
//[3,6,7]
//[6]
//[6,7]
//[7]

public class Test2 {
	public static void main(String[] args) {
		int a[]= {3,6,7};
		int n = a.length;
		
		for (int i = 0; i < n; i++) {      
		    for (int j = i; j < n; j++) { 
		        for (int k = i; k <= j; k++) {
		            System.out.print("[" + a[k] + "]");
		        }
		        System.out.println();
		    }
		}

	
	}
	
	

}
