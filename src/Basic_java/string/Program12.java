package string;

public class Program12 {

	public static void main(String[] args) {
		
		String s= "java!w#qse(";
		
		//s.split("!");
		
		
		
		//String s1 [] = s.split("[!#(]");
		
		
		String s1[]= s.split("[^a-zA-Z0-9]+");
		
		                      
		
		
		for(int i =0; i < s1.length;i++) {
			System.out.println(s1[i]);
		}
		
		

	}

}
