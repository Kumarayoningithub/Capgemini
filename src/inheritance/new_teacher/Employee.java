package inheritance.new_teacher;

public class Employee {
	int id ;
	String name;
	double salary;
	
	public Employee() {
		System.out.println("default cons");
	}
	
	public Employee(int id) {
		this.id= id;
		System.out.println("int id");
	}
	
	public Employee(int id, String name) {
		this(id);
		System.out.println("int id, string name");
		this.name=name;
	}
	
	public Employee(int id, String name, double salary) {
		this(id,name);
		System.out.println("int id, string name, double salary");
		this.salary=salary;
	}
	
	

	public static void main(String[] args) {
		
      Employee e1 = new Employee();
      Employee e2 = new Employee(101);
      Employee e3 = new Employee(102, "Ravi");
      Employee e4 = new Employee(103, "Rohan", 50000);
      

	}

}
