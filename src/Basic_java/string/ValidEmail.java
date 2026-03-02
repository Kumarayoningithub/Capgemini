package string;

public class ValidEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "test@gmail.com";
		System.out.println(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));


	}

}
