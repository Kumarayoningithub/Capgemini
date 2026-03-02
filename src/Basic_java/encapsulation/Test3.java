package encapsulation;

public class Test3 {

	public static void main(String[] args) {
	
		
		//Demo obj = new Demo();
		
		Demo obj = Demo.getA();
		
		obj.setValueA(1000);
		
		
		//obj.setValueA(100);
		
		System.out.println(obj.getValueA());
		
		
      
	}

}
