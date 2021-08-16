package com.spring.crud.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TeacherData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	  @OneToMany(cascade = CascadeType.ALL)
	  @JoinColumn(name = "subject_id" ,referencedColumnName = "id" )
	  Set<SubjectData> enrollsubject=new HashSet<>();
	 
	
	
	
	
	

	
	public Set<SubjectData> getEnrollsubject() {
		return enrollsubject;
	}

	public void setEnrollsubject(Set<SubjectData> enrollsubject) {
		this.enrollsubject = enrollsubject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}





}
