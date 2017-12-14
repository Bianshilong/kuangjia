package com.xxx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.xxx.controller.valueobject.RequestObject;
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
			@RequestBody RequestObject requestObject) {
		ResultObject ro = new ResultObject();
		String[] ids = requestObject.getIds().split(",");
		if (ids != null) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < ids.length; i++) {
				list.add(Integer.parseInt(ids[i]));
			}
			teacherService.delete(list);
		}
		ro.setResult("删除数据成功！");
		return ro;
	}
	
	//获取老师的方法
	@RequestMapping(value="/getOne/{id}")
	public ModelAndView getTeacherById(HttpServletRequest request,HttpServletResponse response,
			@PathVariable Integer id){
		Teacher teacher = teacherService.getOne(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("tec", teacher);
		mv.setViewName("teacher/teacherMod");
		return mv;
	}
	
	//获取所有老师的方法
	@RequestMapping(value="/getall")
	@ResponseBody
	public List<Teacher> getAllTecs(HttpServletRequest request,HttpServletResponse response){
		List<Teacher> list = teacherService.getAllTeachers();
		return list;
	}
}
