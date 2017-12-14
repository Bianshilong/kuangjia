package com.xxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.dao.TeacherMapper;
import com.xxx.model.Teacher;
import com.xxx.service.ITeacherService;

@Service
public class TeacherServiceImpl implements ITeacherService {
	
	@Autowired
	private TeacherMapper teacherMapper;

	@Override
	public boolean insert(Teacher teacher) {
		teacherMapper.insert(teacher);
		return true;
	}

	@Override
	public boolean update(Teacher teacher) {
		teacherMapper.updateByPrimaryKey(teacher);
		return true;
	}

	@Override
	public boolean delete(List<Integer> ids) {
		teacherMapper.deleteByIds(ids);
		return true;
	}

	@Override
	public Teacher getOne(Integer id) {
		Teacher teacher = teacherMapper.selectByPrimaryKey(id);
		return teacher;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		List<Teacher> list = teacherMapper.selectAll();
		return list;
	}

}
