package oop.fundamental.non_static_initializer;

public class Student {
	
	String name;
	int id;
	double per;
	
	Student(){
		
	}
	
	
	Student(String name, int id, double per){
		this.name= name;
		this.id=id;
		this.per=per;
		
		
	}
	
	Student( int id, double per,String name){
		this.name= name;
		this.id=id;
		this.per=per;
	}
	
	
	Student( double per,int id, String name){
		this.name= name;
		this.id=id;
		this.per=per;
	}
	
	
	
		
		
	
	
	
	public void display() {
		
		System.out.println("name="+name);
		System.out.println("id="+id);
		System.out.println("per="+per);
	}

	

}
