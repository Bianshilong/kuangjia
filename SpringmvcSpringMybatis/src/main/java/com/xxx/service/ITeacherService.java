package com.xxx.service;

import java.util.List;

import com.xxx.model.Teacher;

public interface ITeacherService {
	
	//增加老师的记录
	boolean insert(Teacher teacher);
	
	//更新老师
	boolean update(Teacher teacher);
	
	//删除老师
	boolean delete(List<Integer> ids);
	
	//根据id去获取
	Teacher getOne(Integer id);
	
	//获取所有记录
	List<Teacher> getAllTeachers();
}
