package org.tnsif.joinedinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

//child class
//to demonstrate the example on class per table inheritance
@Entity
@Table(name="Citizen")

public class Citizen extends Student {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String citizenType;
	private int passportNumber;
	
	
	public String getCitizenType() {
		return citizenType;
	}
	public void setCitizenType(String citizenType) {
		this.citizenType = citizenType;
	}
	public Integer getpassportNumber() {
		return passportNumber;
	}
	public void passportNumber(Integer passportNumber) {
		this.passportNumber = passportNumber;
	}
	

}
