package operators.compound_assignmentoperators;

public class Program1 {

	public static void main(String[] args) {
		
		int a = 10;
		//a= a+10.5;// error
		
		a+=10;
		a+=10.5;// a=a+10 --> 20
		
		//a+=10.5;  // 20 + 10   
		
		
		System.out.println(a);

	}

}
