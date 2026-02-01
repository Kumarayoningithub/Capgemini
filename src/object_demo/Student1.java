package object_demo;

public class Student1 {

	    String name;
	    String email;
	    String phone;

	    public Student1(String name, String email, String phone) {
	    	super();
	        this.name = name;
	        this.email = email;
	        this.phone = phone;
	    }

	    @Override
	    public boolean equals(Object obj) {
	    	
	    	

	        if (obj instanceof Employee1) {
	            Employee1 e = (Employee1) obj;
	            
	            if(this.email == e.email || this.phone == e.phone) {
	            	return true;
	            }
	            
	            
	        }
	        

	        else if(obj instanceof Student1) {
	            Student1 s = (Student1) obj;
	            
	            
	            if(this.email==s.email || this.phone == s.phone) {
	            	return true;
	            }
	            return this.email.equals(s.email)
	                    || this.phone.equals(s.phone);
	        }

	        return false;
	    }

	    public static void main(String[] args) {

	        Student1 s1 = new Student1("Rohit", "rohit@gmail.com", "1234");
	        Student1 s2 = new Student1("Rohit", "rohit@gmail.com", "1234");

	        Employee1 e1 = new Employee1("Rahul", "rohit@gmail.com1", "12345");

	        System.out.println(s1.equals(s2)); // true
	        System.out.println(s1.equals(e1)); // false
	    }
	}


