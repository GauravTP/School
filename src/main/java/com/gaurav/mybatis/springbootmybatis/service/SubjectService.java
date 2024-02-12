package com.gaurav.mybatis.springbootmybatis.service;

import com.gaurav.mybatis.springbootmybatis.domain.Subject;
import com.gaurav.mybatis.springbootmybatis.mapper.SchoolMapper;
import com.gaurav.mybatis.springbootmybatis.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

	@Autowired
	private SchoolMapper schoolMapper;
	
	@Autowired
	private SubjectMapper subjectMapper;

	public void addSubject(Subject subject) {
		subjectMapper.insertSubject(subject);
	}

	public List<Subject> getAllSubjects() {
		return subjectMapper.selectAllSubjects();
	}
}
