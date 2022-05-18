package com.academy.dto;

import java.util.Date;

public class StudentRequest {
	
	
	private String firstName;
	private String lastName;
	private Date birth_Date;
	private String gender;
	
	
	
	
	
	public StudentRequest() {
		
	}
	public StudentRequest(String firstName, String lastName, Date birth_Date, String gender) {
		
		this.lastName = lastName;
		this.firstName = firstName;
		this.birth_Date = birth_Date;
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirth_Date() {
		return birth_Date;
	}
	public void setBirth_Date(Date birth_Date) {
		this.birth_Date = birth_Date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
