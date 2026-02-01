package inheritance.new_teacher;

public class Animal {
    String place;
    String type;
    
    public Animal(String place, String type) {
           this.place=place;
           this.type=type;
    }
    
    public void displayAnimal() {
    	System.out.println(this.place);
    	System.out.println(this.type);
    }
}
