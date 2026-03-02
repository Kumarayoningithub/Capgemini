package inheritance.new_teacher;

class Dog extends Animal {
	
	int no_of_legs;
	int age;
	
	public Dog(String place, String type, int no_of_legs, int age) {
		
		super(place, type);
        this.no_of_legs=no_of_legs;
        this.age=age;
     }
	
	
	public void displayDog() {
		displayAnimal();
		System.out.println(this.no_of_legs);
		System.out.println(this.age);
		
	}
	
	public static void main(String[] args) {
		
	}
	
	

}
