package com.spring.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud.entity.SubjectData;
@Repository
public interface SubjectRepo extends JpaRepository<SubjectData, Integer> {
	SubjectData findByName(String name);
	SubjectData save(String name);

	

}
