package runtime_polymorphisim;

public class Test {

	public static void main(String[] args) {
		
     Lion lion = new Lion();
     lion.sound();
     
     Dog dog = new Dog();
     
     dog.sound();
     
     
     // upcasting
     
     Animal animal = new Lion();
     
     animal.sound(); // method overriding
     
     Animal animal2 = new Dog();
     
     animal2.sound(); 
	}

}
