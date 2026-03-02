package exception_handling;

public class CustomException {
	
	public static void calcResult(double percentage) {
		
		if(percentage>0 && percentage <= 100) {
			if(percentage>45) {
				System.out.println("Passed");
			}
		}else {
			throw new InvalidPercentageException("percentage is invalid");
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		try {
			calcResult(120);
		}catch(InvalidPercentageException e){
			
			System.out.println(e.getMessage());
		}
		System.out.println("Program ended");
		
	}

}
