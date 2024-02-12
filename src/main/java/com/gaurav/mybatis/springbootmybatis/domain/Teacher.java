package com.gaurav.mybatis.springbootmybatis.domain;

public class Teacher {

	private int id;
	private String name;
	private String subjectExpertise;
	
	public Teacher() {}
	
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

	public String getSubjectExpertise() {
		return subjectExpertise;
	}

	public void setSubjectExpertise(String subjectExpertise) {
		this.subjectExpertise = subjectExpertise;
	}
}
