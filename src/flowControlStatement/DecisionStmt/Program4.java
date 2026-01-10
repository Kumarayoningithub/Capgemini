package flowControlStatement.DecisionStmt;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// special 2 digit no
		
		// 29 ----> 2+9 , 2*9 --> 11 + 18 = 29
		
		
		int n = 29;
		int original = n;
		
		int ld = 29%10;
		n=n/10;
		
		int sum = n+ld;
		int product = n*ld;
		
		if((sum+product)==original){
		    System.out.println("special");
		}
		
		
		
		
        System.out.println(sum);
        System.out.println(product);

	}

}
