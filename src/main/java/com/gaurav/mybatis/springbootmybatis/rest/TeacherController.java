package com.gaurav.mybatis.springbootmybatis.rest;

import com.gaurav.mybatis.springbootmybatis.domain.Teacher;
import com.gaurav.mybatis.springbootmybatis.dto.TeacherSubjectDTO;
import com.gaurav.mybatis.springbootmybatis.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@PostMapping
	public void addTeacher(@RequestBody Teacher teacher) {
		teacherService.addTeacher(teacher);
	}

	@GetMapping
	public List<Teacher> getAllTeachers() {
		return teacherService.getAllTeachers();
	}

	@GetMapping("/{teacherId}/subjects")
	public TeacherSubjectDTO getTeacherSubject(@PathVariable int teacherId) {
		return teacherService.getTeacherSubject(teacherId);
	}
}
