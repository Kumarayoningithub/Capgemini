package exception_handling;

public class Exception2 {

	public static void main(String[] args) {
		
		int [] arr = {2,3,6,8,1};
		
		System.out.println("programming");
		
		
		try {
		
		arr[5]= 6;}
		catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("program end");
		
		

	}

}
