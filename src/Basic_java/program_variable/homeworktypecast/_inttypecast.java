package program_variable.homeworktypecast;

public class _inttypecast {

	public static void main(String[] args) {
		
		int a = 64;
		
		
		byte b = (byte)a; // size 1 byte 
		
		System.out.println(b); // int to byte
		
		short c = (byte)a; // size 2 byte 
		
		System.out.println(c); // int to short
		
		
		
		long d = a; // size --> 8 byte 
        System.out.println(d); // int to long
        
        float e = a; // size --> 4 byte 
        System.out.println(e); // int to float 
        
        double f = a; // size --> 8 byte 
        System.out.println(f); // int to double 
        
        char ch = (char)a; // size-->2 byte
        System.out.println(ch); // int to char
        

	}

}
