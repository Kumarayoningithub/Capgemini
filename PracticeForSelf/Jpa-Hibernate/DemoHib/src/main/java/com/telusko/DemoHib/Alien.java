package com.telusko.DemoHib;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// @Entity(name="alien_table") -> use this if, class name different
// but if we want to create table by customized name 
@Entity
//@Table(name="alien_table")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien { // POJO class
	@Id
    private int aid;
    
    private AlienName aname;
    
  // @Column(name="alien_color")
    private String color;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

//	public String getAname() {
//		return aname;
//	}
//
//	public void setAname(String aname) {
//		this.aname = aname;
//	}

	public void setAname(AlienName aname) {
		this.aname = aname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
    
	
}
