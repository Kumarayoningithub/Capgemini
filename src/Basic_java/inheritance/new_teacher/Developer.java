package inheritance.new_teacher;

public class Developer extends Employe{
	String technology;
	
	public Developer(String name, int age, int id, double salary, String technology) {
		super(name,age,id,salary);
		this.technology=technology;
		
	}
	
	public void displayDeveloper() {
		displayEmploye();
		System.out.println(this.technology);
	}
	
	public static void main(String[] args) {
		Developer d1 = new Developer("Ayan", 23, 101, 50000, "spring");
		
		d1.displayDeveloper();
	}
	
}
