package com.spring.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.dao.TeacherRepo;
import com.spring.crud.entity.SubjectData;
import com.spring.crud.entity.TeacherData;
@Service
public class TeacherImpl implements Teacher {
	
	@Autowired private TeacherRepo teacherRepo;

	@Override
	public List<TeacherData> getAllTeacherData() {
		
		return teacherRepo.findAll();
	}

	@Override
	public TeacherData createTeacher(TeacherData teacherData) {
		
		return teacherRepo.save(teacherData);
	}

	@Override
	public TeacherData getTeacherById(int teacherId) {
		
		return teacherRepo.findById(teacherId).get();
	}


	/*
	 * @Override public TeacherData save(SubjectData subName) {
	 * 
	 * return teacherRepo.save(subName); }
	 */

}
