package com.gaurav.mybatis.springbootmybatis.dto;

import com.gaurav.mybatis.springbootmybatis.domain.Subject;

import java.util.List;

public class TeacherSubjectDTO {

	private int id;
	private String name;
	private List<Subject> subject;
	
	public TeacherSubjectDTO() {}

	public TeacherSubjectDTO(int id, String name, List<Subject> subject) {
		this.id = id;
		this.name = name;
		this.subject = subject;
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

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
}