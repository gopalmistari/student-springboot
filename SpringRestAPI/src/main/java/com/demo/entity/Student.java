package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studId;
	
	private String studName;
	private String studCity;
	private String studEmail;
	private int studMarks;
	
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudCity() {
		return studCity;
	}
	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}
	public String getStudEmail() {
		return studEmail;
	}
	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}
	public int getStudMarks() {
		return studMarks;
	}
	public void setStudMarks(int studMarks) {
		this.studMarks = studMarks;
	}
	
	
	

}
