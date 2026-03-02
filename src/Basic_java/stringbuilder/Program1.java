package stringbuilder;

public class Program1 {

	public static void main(String[] args) {
	  
		
		StringBuilder sb = new StringBuilder();
		
		
		System.out.println(sb.length());
		
		sb.append("1234567890123456");
		
		System.out.println(sb.capacity());
		
		sb.append("1234567890123456123456");
		
		System.out.println(sb.capacity());
		
		
		
		
		

	}

}
