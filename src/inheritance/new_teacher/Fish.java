package inheritance.new_teacher;

class Fish extends  Animal {
	
	int fins;
	
	public Fish(String place, String type, int fins) {
		
		super(place, type);
        this.fins=fins;
       
     }
	
	
	public void displayFish() {
		displayAnimal();
		System.out.println(this.fins);
	
		
	}
	
	
	public static void main(String[] args) {
		
		Fish f = new Fish("water", "ocean", 7);
		f.displayFish();
		
	}
   
}
