package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public Student saveStudent(Student student) {
		Student std=studentRepository.save(student);
		return std;
	}
	
	@Override
	public Student getStudentById(Integer studId) {
		Student std=studentRepository.findBystudId(studId);
		return std;
	}

	@Override
	public Student updateStudentById(Student student, Integer studId) {
		student.setStudId(studId);
		Student std=studentRepository.save(student);
		return std;
		
	}

	@Override
	public void deleteStudentById(Integer studId) {
		studentRepository.deleteById(studId);
		
	}

}
