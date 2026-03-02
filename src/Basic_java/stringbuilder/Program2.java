package stringbuilder;

public class Program2 {

	public static void main(String[] args) {
		
     StringBuilder sb = new StringBuilder("Hello");
    // System.out.println(sb.capacity());
     
     sb.append("123456789123456");
     
     System.out.println(sb.capacity()); // 21
     
     
     StringBuilder sb1 = new StringBuilder(1000);
     
     System.out.println(sb1.capacity());
     
     

	}

}
