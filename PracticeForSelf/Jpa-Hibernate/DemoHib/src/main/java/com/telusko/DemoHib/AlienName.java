package com.telusko.DemoHib;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable// by this Alien table's name column will become 
// 			internal table and we can store another table
public class AlienName {
     private String fname;
     private String mname;
     private String lname;
	 public String getFname() {
		 return fname;
	 }
	 public void setFname(String fname) {
		 this.fname = fname;
	 }
	 public String getMname() {
		 return mname;
	 }
	 public void setMname(String mname) {
		 this.mname = mname;
	 }
	 public String getLname() {
		 return lname;
	 }
	 public void setLname(String lname) {
		 this.lname = lname;
	 }
	 @Override
	 public String toString() {
		return "AlienName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	 }
     
     
}
