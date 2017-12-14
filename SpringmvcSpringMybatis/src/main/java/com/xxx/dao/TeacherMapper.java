package com.xxx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xxx.model.Teacher;

public interface TeacherMapper {
	
	//插入记录
	int insert(Teacher tec);
	
	//更新记录
	int updateByPrimaryKey(Teacher teacher);
	
	//根据主键id删除记录
	int deleteByPrimaryKey(Integer id);
	
	//根据id删除多个数据
	int deleteByIds(@Param("ids") List<Integer> list);
	
	//根据主键来查询单条记录
	Teacher selectByPrimaryKey(Integer id);
	
	//查询所有老师的记录
	List<Teacher> selectAll();
	
}
