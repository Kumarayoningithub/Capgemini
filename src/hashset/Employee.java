//package hashset;
//import java.util.Objects;
//
//public class Employee {
//      int id;
//      String email;
//      int age ;
//      
//      
//      public Employee(int id, String email, int age) {
//    	  this.id = id;
//    	  this.email=email;
//    	  this.age= age;
//      }
//      
//      public int getId() {
//          return id;
//      }
//
//      public String getEmail() {
//          return email;
//      }
//
//      public int getAge() {
//          return age;
//      }
//      
//      
//      @Override
//      public boolean equals(Object obj) {
//          if (this == obj) return true;
//          if (!(obj instanceof Employee)) return false;
//          Employee other = (Employee) obj;
//          return id == other.id;
//      }
//
//      @Override
//      public int hashCode() {
//          return Objects.hash(id);
//      }
//
//      
//}
