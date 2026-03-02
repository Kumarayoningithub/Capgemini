package oop.fundamental.non_static.methods;

public class Test {
	
	// Constructor 
	// Non static method -->  dont have return type
	
	// Student, id name, per constructor and display()
	
	
	

	public static void main(String[] args) {
		
System.out.println(new Person());
System.out.println(new Person(10));

Person p1 = new Person("A", 20, "Male");
p1.display();
		
//		new Person();
//		new Person(10);
		
		
		
		
		
		
//		Person person1 = new Person();
//		
//		person1.name="A";
//		person1.age=20;
//		person1.gender="Male";
//		
//		person1.display();
//		
//		
//		
//		person1.initialize("nm", 18,"gg");
//		
//		
//		
//		
//		
//		
//		person1.display();
//		
//		
//		
//		
////		System.out.println(person1.name);--> too much reoeatation
////		System.out.println(person1.age);
////		System.out.println(person1.gender);
//		
//		//person1.display();  // here this is the shortcut 
//		
//		
//		Person person2 = new Person();
//		person2.initialize("B", 22, "female");
//		
//		person2.display();
//		
////		person2.name="B";
////		person2.age=21;
////		person2.gender = "Female";
//		
//		//person2.display();
//		
////		System.out.println(person2.name);
////		System.out.println(person2.age);
////		System.out.println(person2.gender);
//		
//		
		// java priority queue question...
	}

}
