package oop.fundamental.non_static_initializer;

public class Program1 {

	// sb, main , nsb - 3, test, nsb - 3, test
	
	
		
		
		static {
			System.out.println("static block 1");
		}
		// Non Static Multi-line Initializer-> depends on object create 
		
		 {
			System.out.println("static block 3");
		}
		
		public static void main(String[] args) {
			
			
			System.out.println("main");
			
			new Program1();   // here by this 4 times static block 3 will get execute
			new Program1();
//			new Program1();
//			new Program1();
			
			
		}
		
		public int test() {
			System.out.println("Test");
			return 10;
		}
		
		int a = test();
		
		
		

//		static {
//			System.out.println("static block 2");
//		}

	

}
