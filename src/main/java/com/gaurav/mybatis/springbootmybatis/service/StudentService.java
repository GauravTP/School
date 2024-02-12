package com.gaurav.mybatis.springbootmybatis.service;

import com.gaurav.mybatis.springbootmybatis.domain.Student;
import com.gaurav.mybatis.springbootmybatis.dto.StudentSubjectsDTO;
import com.gaurav.mybatis.springbootmybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

//	@Autowired
//	private SchoolMapper schoolMapper;
	
	@Autowired
	private StudentMapper studentMapper;

	public Student addStudent(Student student) {
		studentMapper.insertStudent(student);
		return student;
	}

	public void optForSubjects(int studentId, List<Integer> subjectIds) {
		studentMapper.insertStudentSubject(studentId, subjectIds);
	}

	public List<Student> getAllStudents() {
		return studentMapper.selectAllStudents();
	}

	public StudentSubjectsDTO getStudentSubjects(int studentId) {
		return studentMapper.selectStudentWithSubjects(studentId);
	}
}
