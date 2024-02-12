package com.gaurav.mybatis.springbootmybatis.mapper;

import com.gaurav.mybatis.springbootmybatis.config.common.UseDatasourceSchool;
import com.gaurav.mybatis.springbootmybatis.domain.Teacher;
import com.gaurav.mybatis.springbootmybatis.dto.TeacherSubjectDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@UseDatasourceSchool
public interface TeacherMapper {
	void insertTeacher(Teacher teacher);
	List<Teacher> selectAllTeachers();
	TeacherSubjectDTO selectTeacherWithSubjects(@Param("teacherId") int teacherId);
}