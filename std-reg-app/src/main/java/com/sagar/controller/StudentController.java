package com.sagar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sagar.model.Student;
import com.sagar.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
		
		String result = studentservice.addStudent(student);
		return result;
	}

	@GetMapping("/students")
	public List <Student> getAllstudent(){
		return studentservice.getAllstudent();
		
	}
	

	@GetMapping("/student/{roll-no}")
	public Student getStudent(@PathVariable("roll-no")Long rollNo) {
		return studentservice.getStudent(rollNo);
	}
	

	@DeleteMapping("/student/{roll-no}")
	public String deleteStudent(@PathVariable("roll-no")Long rollNo) {
		return studentservice.deleteStudent(rollNo);
	}
	
//	@PutMapping("/student/{roll-no}")
//	public String updateStudent(@RequestBody Student student,@PathVariable Long rollNo) {
//		String result = studentservice.updateStudent(student,rollNo);
//		return result;
//		
//	}
}
