package com.telusko.HiboDemo.HiboDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.*;

@Entity
public class Student {
    @Id
    private int rollno;
    private String name;
    private int marks;
    
   // @OneToOne
    
    // if one student has many laptop then u cant use the normal laptop
    // you need to use the list of laptop to store multiple laptop
    
//   private Laptop laptop;
    
    
   // @OneToMany(mappedBy="student")
    
    @ManyToMany(mappedBy="student")
    private List <Laptop> laptop = new ArrayList<>();
    
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
    
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
    
	
}
