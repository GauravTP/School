package com.gaurav.mybatis.springbootmybatis.service;

import com.gaurav.mybatis.springbootmybatis.domain.Teacher;
import com.gaurav.mybatis.springbootmybatis.dto.TeacherSubjectDTO;
import com.gaurav.mybatis.springbootmybatis.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

//	@Autowired
//	private SchoolMapper schoolMapper;
	
	@Autowired
	private TeacherMapper teacherMapper;

	public void addTeacher(Teacher teacher) {
		teacherMapper.insertTeacher(teacher);
	}

	public List<Teacher> getAllTeachers() {
		return teacherMapper.selectAllTeachers();
	}

	public TeacherSubjectDTO getTeacherSubject(int teacherId) {
		return teacherMapper.selectTeacherWithSubjects(teacherId);
	}
}