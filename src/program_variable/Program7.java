package program_variable;

public class Program7 {

	public static void main(String[] args) {
		
		char ch = 'A'; // 2 byte
		int i = ch; // 4 byte // implicit type casting (widening)
		
		System.out.println(i); 
		
		int j = 65;// 4 byte
		char vh =(char)j;// 2 byte   // explicit type casting (narrowing)
		
		
		
		System.out.println(vh);
		
		

	}

}
