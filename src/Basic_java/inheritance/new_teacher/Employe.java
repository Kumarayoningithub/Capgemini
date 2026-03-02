package inheritance.new_teacher;

class Employe extends Person{
	int id;
	double salary;
	
	public Employe (String name, int age, int id, double salary) {
		super(name,age);
		this.id=id;
		this.salary=salary;
		
	}
	
	public void displayEmploye() {
		
		displayPerson();
		System.out.println(this.id);
   	     System.out.println(this.salary);
   	     
	}
	
	
}
