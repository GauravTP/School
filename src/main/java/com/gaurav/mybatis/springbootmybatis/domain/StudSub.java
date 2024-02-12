package com.gaurav.mybatis.springbootmybatis.domain;

public class StudSub {

	private int id;
	private int studId;
	private int subId;
	
	public StudSub() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}
}

