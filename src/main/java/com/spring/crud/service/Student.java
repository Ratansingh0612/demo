package com.spring.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.crud.entity.StudentData;
@Service
public interface Student {
	List<StudentData> getAllStudentData();
	StudentData createStudent(StudentData studentData);
	StudentData getStudentById(int studentId);
	

}
