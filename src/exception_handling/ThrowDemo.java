package exception_handling;

public class ThrowDemo {
	
	public static void vote(int age)throws ClassNotFoundException {
		if(age>=18) {
			System.out.println("candidate voted");
		}else {
	//		try {
				//throw new ArithmeticException();
			throw new ClassNotFoundException();
		//	}catch(Arithmetic Exception e) {
			//	System.out.println("cant vote");
		//	}
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Candidate went for voting");
		
		try {
			
		  vote(13); }
		catch(Throwable t) {
			System.out.println("candidate cant vote");
		}
		
		System.out.println("candidate came home");
	}

}


