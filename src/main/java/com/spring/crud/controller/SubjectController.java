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
import com.spring.crud.entity.TeacherData;
import com.spring.crud.service.Student;
import com.spring.crud.service.Subject;
import com.spring.crud.service.Teacher;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	

	@Autowired private Subject subject;
	@Autowired private Student student;
	@Autowired private Teacher teacher;
	
	
	@GetMapping("/startSubject")
	public String start() {
		return "everything is okk for subject";
		
	}
	
	
	@GetMapping("/allSubject")
	List<SubjectData> getAllSubject() {
		
		return subject.getAllSubjectData();
		
	}
	
	
	
	
	@PostMapping("/addSubject")
 	SubjectData addSubject(@RequestBody SubjectData st) {
		return subject.createSubject(st);
		
	}
	
	
	
	
	@GetMapping("/getBySubjectName/{name}")
	SubjectData getById(@PathVariable ("name") String name) {
		SubjectData subjId=new SubjectData();
		subjId=subject.getSubjectByName(name);
		return subjId;
		
	}
	
	@PutMapping("/{subjectName}/students/{studentId}")
	SubjectData enrollStudentToSubject(@PathVariable ("subjectName") String subjectName, @PathVariable("studentId") int studentId) {
		SubjectData subName=subject.getSubjectByName(subjectName);
		StudentData studentid=student.getStudentById(studentId);
	
	subName.enrolledStudenttosubject(studentid);
		return subject.save(subName);
		
	}
	
	
	@PutMapping("/{subjectName}/teacher/{teacherid}")
	SubjectData enrollteacherToSubject(@PathVariable ("subjectName") String subjectName, @PathVariable("teacherid") int teacherid) {
		SubjectData subName=subject.getSubjectByName(subjectName);
		TeacherData teacherr=teacher.getTeacherById(teacherid);
	
	subName.enrolledTeachertosubject(teacherr);
		return subject.save(subName);
		
	}


}
