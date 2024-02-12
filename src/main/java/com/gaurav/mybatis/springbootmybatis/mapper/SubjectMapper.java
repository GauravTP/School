package com.gaurav.mybatis.springbootmybatis.mapper;

import com.gaurav.mybatis.springbootmybatis.config.common.UseDatasourceSchool;
import com.gaurav.mybatis.springbootmybatis.domain.Subject;

import java.util.List;

@UseDatasourceSchool
public interface SubjectMapper {
	void insertSubject(Subject subject);
	List<Subject> selectAllSubjects();
}
