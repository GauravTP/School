package com.gaurav.mybatis.springbootmybatis.dto;

import com.gaurav.mybatis.springbootmybatis.domain.Subject;

import java.util.List;

public class StudentSubjectsDTO {

	private int id;
	private String name;
	private List<Subject> subjects;
	public StudentSubjectsDTO() {}

	public StudentSubjectsDTO(int id, String name, List<Subject> subjects) {
		this.id = id;
		this.name = name;
		this.subjects = subjects;
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

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
}
