package program_variable.homeworktypecast;

public class _shorttypecast {

	public static void main(String[] args) {
		
		short a = 67;
		
		
		byte b=(byte) a;// --> size 1 byte
		System.out.println(b); // short to byte
		
		
		int c = a; // size --> 4 byte
        System.out.println(c);  // short to int 
        
        long d = a; // size --> 8 byte 
        System.out.println(d); // short to long
        
        float e = a; // size --> 4 byte 
        System.out.println(e); // short to float 
        
        double f = a; // size --> 8 byte 
        System.out.println(f); // short to double 
        
        char ch = (char)a; // size --> 2 byte  
        
        System.out.println(ch); // short to char

	}

}
