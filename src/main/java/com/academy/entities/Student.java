package com.academy.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Student")

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private Date birth_Date;
	@Column(length = 1)
	private String gender;
	
	public Student () {
		
	}
	
	public Student(Long id, String firstName, String lastName, Date birth_Date, String gender) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birth_Date = birth_Date;
		this.gender = gender;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
