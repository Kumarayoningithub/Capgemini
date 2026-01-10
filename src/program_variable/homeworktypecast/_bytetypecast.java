package program_variable.homeworktypecast;

public class _bytetypecast {

	public static void main(String[] args) {
		
         byte a = 69; // size --> 1 byte
         
         short b=a; // size --> 2 byte 
         System.out.println(b);// byte to short 
         
         int c = a; // size --> 4 byte
         System.out.println(c);  // byte to int 
         
         long d = a; // size --> 8 byte 
         System.out.println(d); // byte to long
         
         float e = a; // size --> 4 byte 
         System.out.println(e); // byte to float 
         
         double f = a; // size --> 8 byte 
         System.out.println(f); // byte to double 
         
         char ch = (char)a; // size --> 2 byte  
         
         System.out.println(ch); // byte to char
         
         
	}

}
