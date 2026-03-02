package array;

public class Program4 {

	public static void main(String[] args) {
		
		int [] a = {1,4,6};
		
		System.out.println();
		
		//a[0]
		System.out.println(a[0]);
		
		
//		//System.out.println(a[3]);// index out of bound--> exception
//		
//		
//		System.out.println(a[-1]);
		
		
		
		// for length->.length
		
		System.out.println(a.length);
		
		
		for(int i =0;i<a.length;i++) {
			System.out.print(" "+ a[i]);
		}
		System.out.println();
		
		
		a[0]= 10;
		a[1]=100;
		a[2]= 200;
		//a[3]= 7889; --> index out of bound exception
		
		for(int i =0;i<a.length;i++) {
			System.out.print(" "+ a[i]);
		}
		
		
		

	}

}
