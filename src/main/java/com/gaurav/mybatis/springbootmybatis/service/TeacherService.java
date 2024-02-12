package com.gaurav.mybatis.springbootmybatis.service;

import com.gaurav.mybatis.springbootmybatis.domain.Teacher;
import com.gaurav.mybatis.springbootmybatis.dto.TeacherSubjectDTO;
import com.gaurav.mybatis.springbootmybatis.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

	@Autowired
	private SchoolMapper schoolMapper;

	public void addTeacher(Teacher teacher) {
		schoolMapper.insertTeacher(teacher);
	}

	public List<Teacher> getAllTeachers() {
		return schoolMapper.selectAllTeachers();
	}

	public TeacherSubjectDTO getTeacherSubject(int teacherId) {
		return schoolMapper.selectTeacherWithSubject(teacherId);
	}
}