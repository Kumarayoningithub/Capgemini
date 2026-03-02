package object_demo;

public class Employee {
	
	int id ;
	String name;
	double salary;
	
	
	
	 
	 
	 public Employee(int id, String name, double salary){
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 
	 }
	 
	 
      public String toString() {
		 
		 return "id : " + id+ ", name: "+name+ ", salary : "+salary;
		 
	 }
		 
	 
	public static void main(String[] args) {
		Employee ed = new Employee(101, "Rohan", 5000);
		
		System.out.println(ed);
		
	}

}
