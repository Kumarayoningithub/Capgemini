package stream;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		List<Student> students = List.of(
				new Student("A", 69, 19),
				new Student("B", 90, 20),
				new Student("C", 78, 17),
				new Student("D", 19, 16)
				);
		List <Student> adult= students.stream()			//creates a list adult and adds the adult students in it.
							.filter(s -> s.age>=18)
							.toList();
		for(Student s:adult) {							//prints the name of students who are adult.
			System.out.println(s.name+" is an adult");
		}
		
		
		
		
		List<Student> passed = students.stream()				//creates a list passed and adds students with marks higher than 60.
								.filter(s -> s.marks > 60)
								.toList();
		System.out.println("Passed students count: "+passed.size());   //prints the count of passed students.
		
		
		
		
		
		List<Student> passedDouble = students.stream()
			    .filter(s -> s.marks > 60)
			    .map(s -> new Student(s.name, s.marks * 2, s.age))  // Create new Student with doubled marks.
			    .toList();								// If you do .map(s -> s.marks*2) it will only save the INTEGER value of the marks and not the entire object.
			    
		for(Student s:passedDouble) {								//prints the double of students' marks who have passed.
			System.out.println(s.name+" has passed and double of his marks is: "+s.marks);
		}
		
	
	}

}

class Student{
	public String name;
	public int marks;
	public int age;
	
	public Student(String name, int marks, int age) {
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

}
