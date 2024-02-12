package com.gaurav.mybatis.springbootmybatis.service;

import com.gaurav.mybatis.springbootmybatis.domain.Subject;
import com.gaurav.mybatis.springbootmybatis.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

	@Autowired
	private SchoolMapper schoolMapper;

	public void addSubject(Subject subject) {
		schoolMapper.insertSubject(subject);
	}

	public List<Subject> getAllSubjects() {
		return schoolMapper.selectAllSubjects();
	}
}
