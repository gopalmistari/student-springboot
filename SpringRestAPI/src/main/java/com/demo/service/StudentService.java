package com.demo.service;

import com.demo.entity.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public Student getStudentById(Integer studId);
	
	public Student updateStudentById(Student student, Integer studId);

	public void deleteStudentById(Integer studId);
	
}
