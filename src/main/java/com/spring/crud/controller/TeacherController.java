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

import com.spring.crud.entity.SubjectData;
import com.spring.crud.entity.TeacherData;
import com.spring.crud.service.Student;
import com.spring.crud.service.Subject;
import com.spring.crud.service.Teacher;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	

	
	@Autowired private Teacher teacher;
	
	
	
	
	@GetMapping("/startTeacher")
	public String start() {
		return "everything is okk for teacher";
		
	}
	
	
	@GetMapping("/allTeacher")
	List<TeacherData> getAllTeacher() {
		
		return teacher.getAllTeacherData();
		
	}
	
	
	
	
	@PostMapping("/addTeacher")
 	TeacherData addTeacher(@RequestBody TeacherData st) {
		return teacher.createTeacher(st);
		
	}
	
	
	
	
	@GetMapping("/getByTeacherId/{id}")
	TeacherData getById(@PathVariable("id") int teacherId) {
		TeacherData teacherid=new TeacherData();
		teacherid=teacher.getTeacherById(teacherId);
		return teacherid;
		
	}
	



}
