package com.xxx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxx.controller.valueobject.ResultObject;
import com.xxx.model.Teacher;
import com.xxx.service.ITeacherService;

@Controller
@RequestMapping(value="/teacher")
public class TeacherController {
	
	@Autowired
	private ITeacherService teacherService;
	
	//添加或更新老师的方法
	@RequestMapping(value="/addOrmod")
	public @ResponseBody ResultObject modTeacher(HttpServletRequest request,HttpServletResponse response,
			@RequestBody Teacher teacher) {
		ResultObject ro = new ResultObject();
		if (null == teacher || null==teacher.getTecId()) {
			return ro;
		}
		
		if (teacher.getId()==null) {
			teacherService.insert(teacher);
		}else {
			teacherService.update(teacher);
		}
		ro.setResult("ok");
		return ro;
	}
	
	//删除老师的方法
	@RequestMapping(value="/del")
	public @ResponseBody ResultObject deleteByIds(HttpServletRequest request,HttpServletResponse response,
			@RequestBody Teacher teacher) {
		ResultObject ro = new ResultObject();
		
		return ro;
	}
}
