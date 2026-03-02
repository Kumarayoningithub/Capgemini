package inheritance.new_teacher;

public class Person {
      String name;
      int age;
      
      public Person(String name, int age) {
    	  super();
    	  this.age= age;
    	  this.name = name;
      }
      
      public void displayPerson() {
    	  System.out.println(this.age);
    	  System.out.println(this.name);
    	  
      }
}









