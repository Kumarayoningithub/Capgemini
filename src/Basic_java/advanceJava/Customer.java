package advanceJava;

public class Customer {
       double networth;
       String name;
       
       public Customer(double networth, String name) {
    	   this.networth= networth;
    	   this.name= name;
       }
       
       
       @Override
       public String toString() {
           return name + " -> " + networth;
       }
       
}
