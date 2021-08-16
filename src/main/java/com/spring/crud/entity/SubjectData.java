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
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SubjectData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	             name = "Student_enrolled",
	             joinColumns=@JoinColumn(name = "student_id"),
	             inverseJoinColumns =@JoinColumn(name="subject_id")
	)
	private Set<StudentData> enrolledstudent=new HashSet<>();
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "teacher_id" ,referencedColumnName = "id" ) 
	
	private TeacherData teacherData;
	
	
	
	
	
	
	
	public Set<StudentData> getEnrolledstudent() {
		return enrolledstudent;
	}
	public void setEnrolledstudent(Set<StudentData> enrolledstudent) {
		this.enrolledstudent = enrolledstudent;
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
	public void enrolledStudenttosubject(StudentData st) {
		enrolledstudent.add(st);
	}

	public TeacherData getTeacherData() {       
		return teacherData;
	}
	public void setTeacherData(TeacherData teacherData) {
		this.teacherData = teacherData;
	}
	public void enrolledTeachertosubject(TeacherData teacherData) {
		this.teacherData= teacherData;
			
			
		}
	
	

}
