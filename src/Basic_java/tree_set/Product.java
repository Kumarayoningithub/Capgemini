package tree_set;

public class Product implements Comparable<Product>{
	
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}

	@Override
	public int compareTo(Product p) {
		
		if(this.id <p.id) {
			return -1;
		}
		
		else if(this.id >p.id) {
			return 1;
		}
		
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
	    return "Product { " +
	           "id = " + id +
	           ", name = '" + name + '\'' +
	           ", price = " + price +
	           " }";
	}

}