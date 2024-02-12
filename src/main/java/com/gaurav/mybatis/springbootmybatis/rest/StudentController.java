package com.gaurav.mybatis.springbootmybatis.rest;

import com.gaurav.mybatis.springbootmybatis.domain.Student;
import com.gaurav.mybatis.springbootmybatis.dto.StudentSubjectsDTO;
import com.gaurav.mybatis.springbootmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}

	@PostMapping("/{studentId}/subjects")
	public void optForSubjects(@PathVariable int studentId, @RequestBody List<Integer> subjectIds) {
		studentService.optForSubjects(studentId, subjectIds);
	}

	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/{studentId}/subjects")
	public StudentSubjectsDTO getStudentSubjects(@PathVariable int studentId) {
		return studentService.getStudentSubjects(studentId);
	}
}
