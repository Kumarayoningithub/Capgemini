package com.telusko.HiboDemo.HiboDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.*;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String lname;
    
    // for many to one 
//    @ManyToOne
//    private Student student;
//    
    
    
    // for many to many mapping
    @ManyToMany
    private List <Student> student = new ArrayList<>();
    
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	
    
}
