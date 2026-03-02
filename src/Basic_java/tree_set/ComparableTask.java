package tree_set;
import java.util.*;
public class ComparableTask {
	public static void main(String [] args){
		// TODO Auto-generated method stub
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		
		Employee e1 = new Employee(1,"A",30000);
		Employee e2 = new Employee(1,"B",30000);
		Employee e3 = new Employee(1,"C",40000);
		
		
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		
		System.out.println(ts);

	}

}
