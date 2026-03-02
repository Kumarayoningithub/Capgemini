package stringbuilder;
import java.util.*;

public class RemoveUserEnterCharacter {

	public static void main(String[] args) {
		
		String s = "Hello";
		 StringBuilder sb = new StringBuilder(s);
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		
	
		
		for(int i =0;i<sb.length();i++) {
			
			if(sb.charAt(i)==ch) {
				
				sb.delete(i,i+1);
				
			}
		}
		
		
		
		System.out.println(sb);
		
		String z = sb.toString();
		
		System.out.println(z);
		
		
		
		
		
		

	}

}
