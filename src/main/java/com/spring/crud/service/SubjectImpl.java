package com.spring.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.dao.SubjectRepo;
import com.spring.crud.entity.SubjectData;
@Service
public class SubjectImpl implements Subject {
	
	@Autowired private SubjectRepo subjectRepo;

	@Override
	public List<SubjectData> getAllSubjectData() {
		
		return subjectRepo.findAll();
	}

	@Override
	public SubjectData createSubject(SubjectData subjectData) {
		
		return subjectRepo.save(subjectData);
	}

	@Override
	public SubjectData getSubjectByName(String subjectName) {
		
		return subjectRepo.findByName(subjectName);
	}

	

	@Override
	public SubjectData save(SubjectData subName) {
		
		return subjectRepo.save(subName);
	}

}
