package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.entity.Student;
import com.demo.service.StudentServiceImpl;


@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentServiceImpl studentService;
	
	//saveStudent Operation
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		Student std=studentService.saveStudent(student);
		return ResponseEntity.ok().body(std);
	}
	
	//getStudent Operation 
	@GetMapping("/getById/{studId}")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer studId){
		Student std=studentService.getStudentById(studId);
		return ResponseEntity.ok().body(std);
	}
	
	//updateStudent Operation
	@PutMapping("updateById/{studId}")
	public ResponseEntity<Student> updateStudentById(@RequestBody Student student,@PathVariable Integer studId){
		Student std=studentService.updateStudentById(student, studId);
		return ResponseEntity.ok().body(std);
	}
	
	//deleteStudent Operation
	@DeleteMapping("dlt/{studId}")
	public void deleteStudentById(@PathVariable Integer studId) {
		studentService.deleteStudentById(studId);
		
	}
	
	
	
	
	

}
