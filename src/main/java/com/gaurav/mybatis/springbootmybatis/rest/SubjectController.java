package com.gaurav.mybatis.springbootmybatis.rest;

import com.gaurav.mybatis.springbootmybatis.domain.Subject;
import com.gaurav.mybatis.springbootmybatis.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;

	@PostMapping
	public void addSubject(@RequestBody Subject subject) {
		subjectService.addSubject(subject);
	}

	@GetMapping
	public List<Subject> getAllSubjects() {
		return subjectService.getAllSubjects();
	}
}
