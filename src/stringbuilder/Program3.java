package stringbuilder;

public class Program3 {

	public static void main(String[] args) {
            
		
		StringBuilder sb = new StringBuilder ();
		
		// stringbuilder and string buffer are same but string buffer is thread safe,, but stringbuilder is not thread safe
		
		
		//StringBuffer sb = new StringBuffer();
		
		
		sb.append("abcd");
		
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		sb.append("123hello");
		
		System.out.println(sb);
		
		sb.delete(3, 6);
		
		System.out.println(sb);
		
		sb.insert(2, "student");
		
		System.out.println(sb);
		
		
		
		
		

	}

}
