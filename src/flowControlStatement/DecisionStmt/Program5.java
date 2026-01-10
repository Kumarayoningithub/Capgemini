package flowControlStatement.DecisionStmt;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 1;
		
		
		
		switch (b) { // byte , short , int , char , string
		// non primitive data accept only --> Enum 
		  // b == 1 , 
		case 1:
			System.out.println("1");
			break;
			
		case 2:
			System.out.println("2");
			break;
			
		case 3:
			System.out.println("3");
			break;
			
			default:  // default statement we can put anywhere between the cases no issue 
				System.out.println("hey hi ");
			
		
		}

	}

}
