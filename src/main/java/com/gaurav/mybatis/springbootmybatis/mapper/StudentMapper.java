package com.gaurav.mybatis.springbootmybatis.mapper;

import com.gaurav.mybatis.springbootmybatis.config.common.UseDatasourceSchool;
import com.gaurav.mybatis.springbootmybatis.domain.Student;
import com.gaurav.mybatis.springbootmybatis.dto.StudentSubjectsDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@UseDatasourceSchool
public interface StudentMapper {
	void insertStudent(Student student);
	List<Student> selectAllStudents();
	StudentSubjectsDTO selectStudentWithSubjects(@Param("studentId") int studentId);
	void insertStudentSubject(@Param("studentId") int studentId, @Param("subjectIds") List<Integer> subjectIds);
}
