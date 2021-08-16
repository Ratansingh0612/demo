package com.spring.crud.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class StudentData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "enrolledstudent")
	private Set<SubjectData> enrolledsubj=new HashSet<>();
	
	public Set<SubjectData> getEnrolledsubj() {
		return enrolledsubj;
	}
	public void setEnrolledsubj(Set<SubjectData> enrolledsubj) {
		this.enrolledsubj = enrolledsubj;
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
