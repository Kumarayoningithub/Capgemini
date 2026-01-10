package looping_statement.whileloop;

public class Program3 {

	public static void main(String[] args) {
	
		
		int num = 123;
		int sum = 0;
		
		int product = 1;
		
		while( num!=0) {
			sum = sum + num% 10;
			product = product *num % 10;
			num = num/10;
		}
		
		System.out.println(sum);
		System.out.println(product);
		
		
		if(sum== product) {
			System.out.println("its a spy no");
		}else {
			System.out.println(" no its not");
		}
		
		
	

	}

}
