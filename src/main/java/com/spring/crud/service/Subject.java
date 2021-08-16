package com.spring.crud.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring.crud.entity.StudentData;
import com.spring.crud.entity.SubjectData;
@Service
public interface Subject {
	List<SubjectData> getAllSubjectData();
	SubjectData createSubject(SubjectData subjectData);
	SubjectData getSubjectByName(String subjectName);
	SubjectData save(SubjectData subName);
	

}
