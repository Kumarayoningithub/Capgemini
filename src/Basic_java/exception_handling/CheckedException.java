package exception_handling;

public class CheckedException {

	public static void main(String[] args) throws ClassNotFoundException {
		 // 1. try-catch
		// 2 throws -> declaring the exception (we are telling jvm  to ignore the exception
		
		System.out.println("Program started");
		
//		try {
			Class.forName("");
//		}
//		catch (ClassNotFoundException c) {
//			System.out.println("Exception handled");
//		}
//		
		
		System.out.println("Program ended");
		
		

	}

}
