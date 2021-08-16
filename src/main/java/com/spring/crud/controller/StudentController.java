package com.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.entity.StudentData;
import com.spring.crud.entity.SubjectData;
import com.spring.crud.service.Student;
import com.spring.crud.service.Subject;
import com.spring.crud.service.Teacher;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	

	@Autowired private Student student;

	
	
	
	
	@GetMapping("/start")
	public String start() {
		return "everything is okk for Student";
		
	}
	
	
	@GetMapping("/allStudent")
	List<StudentData> getAllStudent() {
		
		return student.getAllStudentData();
		
	}
	
	
	
	
	@PostMapping("/addStudent")
 	StudentData addStudent(@RequestBody StudentData st) {
		return student.createStudent(st);
		
	}
	
	
	
	
	@GetMapping("/getByStudentId/{id}")
	StudentData getById(@PathVariable ("id") int studeenetId) {
		StudentData studentid=new StudentData();
		studentid=student.getStudentById(studeenetId);
		return studentid;
		
	}
	
	
	
	

	
	
	
	
	

}
