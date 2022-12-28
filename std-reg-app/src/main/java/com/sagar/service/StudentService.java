package com.sagar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.dao.StudentRepository;
import com.sagar.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentrepo;

	public String addStudent(Student student) {

		Student std = studentrepo.save(student);

		return "Student " + std.getFirstName() + " has been added....!!";
	}

	public List<Student> getAllstudent() {
		List<Student> stds = (List<Student>) studentrepo.findAll();

		return stds;
	}

	public String deleteStudent(Long rollNo) {
		 studentrepo.deleteById(rollNo);
		return "Student is deleted";
	}

	public Student getStudent(Long rollNo) {
		Optional<Student> std = studentrepo.findById(rollNo);
		return std.isPresent() ? std.get() : new Student();

	}

//	public String updateStudent(Student student, Long rollNo) {
//		for (int i = 0; i < student.size(); i++) {
//			Student rs=student.get(i);
//			 if(rs.getId().equals(id)) {
//				 student.set(i,student);
//				 
//			 }
			
			
//		}
//		return null;
	}



