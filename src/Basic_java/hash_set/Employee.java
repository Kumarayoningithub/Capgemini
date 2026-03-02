//package hash_set;
//
//public class Employee {
//	
//	int id;
//	
//	String name;
//	double salary;
//	
//	public Employee(int id, String name, double salary) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
//	
//	 @Override
//	    public String toString() {
//	        return "Employee [id=" + id + 
//	               ", name=" + name + 
//	               ", salary=" + salary + "]";
//	    }
//	 
//	 public int hashCode() {
//	        return Objects.hash(id, name, salary);
//	    }
//	 
//	 public boolean equals(Object obj) {
//
//	        if (this == obj) return true;
//
//	        if (obj == null || getClass() != obj.getClass())
//	            return false;
//
//	        Employee e = (Employee) obj;
//
//	        return id == e.id &&
//	               Double.compare(e.salary, salary) == 0 &&
//	               name.equals(e.name);
//	 
//	 
//
//}
