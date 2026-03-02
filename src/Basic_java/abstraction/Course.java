package abstraction;

public abstract class Course {
     String name;
     public void Course(String name) {
    	 this.name = name;
     }
     
     public void CourseInfo() {
    	 
    	 System.out.println("name"+ name);
     }
     
     
     public abstract void CoursePrice();
     
}
