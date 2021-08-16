package com.spring.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.dao.StudentRepo;
import com.spring.crud.entity.StudentData;
@Service
public class StudentImpl implements Student {
	
	@Autowired private StudentRepo studentRepo;

	@Override
	public List<StudentData> getAllStudentData() {
	
		return studentRepo.findAll();
	}

	@Override
	public StudentData createStudent(StudentData studentData) {
		
		return studentRepo.save(studentData);
	}

	@Override
	public StudentData getStudentById(int studentId) {
		
		return studentRepo.findById(studentId).get();
	}

}
