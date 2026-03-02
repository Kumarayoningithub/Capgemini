package array;

public class Program7 {

	public static void main(String[] args) {
		
//		Employee e1 = new Employee(1, "Adam, 200000");
//		Employee e2 = new Employee(2, "Miller", 300000");
//		Employee e3 = new Employee(3, "King", 400000");
		
		int [] i = new int[3];
		i[0]= 23;
		i[1]= 24;
		i[2]=25;
		
		
		Employee [] employee = new Employee[5];
		employee[0]=new Employee(1, "Adam", 200000);
		employee[1]= new Employee(2, "Miller", 300000);
		employee[2]=new Employee(3, "King", 400000);
		
		
		for(int j =0;j<employee.length;j++){
			
		   employee[j].display();
			
			
		}
		
		
		
	}

}
