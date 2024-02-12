package com.gaurav.mybatis.springbootmybatis.mapper;

import com.gaurav.mybatis.springbootmybatis.config.common.UseDatasourceSchool;
import com.gaurav.mybatis.springbootmybatis.domain.Student;
import com.gaurav.mybatis.springbootmybatis.domain.Subject;
import com.gaurav.mybatis.springbootmybatis.domain.Teacher;
import com.gaurav.mybatis.springbootmybatis.dto.StudentSubjectsDTO;
import com.gaurav.mybatis.springbootmybatis.dto.TeacherSubjectDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@UseDatasourceSchool
public interface SchoolMapper {
	void insertStudent(Student student);
	void insertTeacher(Teacher teacher);
	void insertSubject(Subject subject);
	void insertStudentSubject(@Param("studentId") int studentId, @Param("subjectIds") List<Integer> subjectIds);
	List<Student> selectAllStudents();
	StudentSubjectsDTO selectStudentWithSubjects(int studentId);
	List<Teacher> selectAllTeachers();
	TeacherSubjectDTO selectTeacherWithSubject(int teacherId);
	List<Subject> selectAllSubjects();
}