package methods;

public class StrongNumber {
	
	public static int frac(int a) {
		if(a==1) {
			return 1;
		}else {
			int x = 1;
			for(int i = 1;i<=a;i++) {
				
				x=x*i;
			}
				
				return x;
		}
		 
		
		
	}
	
	public static void strong(int a) {
		
		
		int k = a;
		int sum = 0;
		
		while(k!=0) {
			int ld = k%10;
			int store= frac(ld);
			sum=sum+store;
			k=k/10;
			
			
		}
		
		if(sum==a)
		
		System.out.println("strong no");
		else System.out.println("not strong");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		strong(145);

	}

}
