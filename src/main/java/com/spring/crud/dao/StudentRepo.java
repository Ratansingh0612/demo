package com.spring.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud.entity.StudentData;
@Repository
public interface StudentRepo extends JpaRepository<StudentData, Integer>{

}
