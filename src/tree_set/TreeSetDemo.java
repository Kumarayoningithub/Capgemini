package tree_set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
//		TreeSet<String> ts= new TreeSet<String>();
//		ts.add("K");
//		ts.add("A");
//		ts.add("Z");
//		ts.add("B");
//		
//		System.out.println(ts);
//		
		TreeSet<Product> ts= new TreeSet<Product>();
		
		ts.add(new Product(1, "Samsung", 90000));
		ts.add(new Product(3, "Iphone", 70000));
		ts.add(new Product(2, "Mi", 50000));
		ts.add(new Product(1, "Samsung", 30000));
		
		System.out.println(ts);
	}

}
