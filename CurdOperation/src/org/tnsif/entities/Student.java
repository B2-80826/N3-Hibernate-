package org.tnsif.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	//data
	@Id
	private int rollnumber;
	private String stuentname;
//getter and setter methods 
	
public int getRollnumber() {
		return rollnumber;
	}


	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getStuentname() {
		return stuentname;
	}
	public void setStuentname(String stuentname) {
		this.stuentname = stuentname;
	}

}
