package org.tnsif.joinedinheritance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Student")
@Inheritance(strategy=InheritanceType.JOINED)
public class Student implements Serializable{


	private static final long serialVersionUID = 1L;
	
	//data members
	@Id
	private int roll;
	private String name;
	private float percentage;
	 
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	
	
	
}