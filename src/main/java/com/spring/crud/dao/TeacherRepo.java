package com.spring.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud.entity.TeacherData;
@Repository
public interface TeacherRepo extends JpaRepository<TeacherData, Integer>  {
	TeacherData save(String s);

}
