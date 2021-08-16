package com.spring.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.crud.entity.SubjectData;
import com.spring.crud.entity.TeacherData;
@Service
public interface Teacher {
	List<TeacherData> getAllTeacherData();
	TeacherData createTeacher(TeacherData teacherData);
	TeacherData getTeacherById(int teacherId);
	

}
