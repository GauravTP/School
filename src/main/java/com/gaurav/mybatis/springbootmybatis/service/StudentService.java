package com.gaurav.mybatis.springbootmybatis.service;

import com.gaurav.mybatis.springbootmybatis.domain.Student;
import com.gaurav.mybatis.springbootmybatis.dto.StudentSubjectsDTO;
import com.gaurav.mybatis.springbootmybatis.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

	@Autowired
	private SchoolMapper schoolMapper;

	public void addStudent(Student student) {
		schoolMapper.insertStudent(student);
	}

	public void optForSubjects(int studentId, List<Integer> subjectIds) {
		schoolMapper.insertStudentSubject(studentId, subjectIds);
	}

	public List<Student> getAllStudents() {
		return schoolMapper.selectAllStudents();
	}

	public StudentSubjectsDTO getStudentSubjects(int studentId) {
		return schoolMapper.selectStudentWithSubjects(studentId);
	}
}
