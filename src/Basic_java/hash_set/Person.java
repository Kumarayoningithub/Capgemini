//package hash_set;
//
//public class Person {
//	int id;
//	String email;
//	int age;
//	
//	
//	public Person(int id, String email, int age) {
//      this.id = id;
//      this.email = email;
//      this.age = age;
//      
//      
//  }
//	
//	
//	public int hashCode() {
//		return ((Integer)id).hashCode()+email.hashCode();
//	}
//	
//	public boolean equals (Object obj) {
//		Person p = (Person) obj;
//		
//		if(this.id==p.id && this.email.equals(p.email)) {
//			return true;
//		}
//		
//		return false;
//	}
//	
//	@Override
//	
//	public String toString() {
//		return "id: "+id + "email," + email", age: "+age;
//	}
//	
//	
//
//}
