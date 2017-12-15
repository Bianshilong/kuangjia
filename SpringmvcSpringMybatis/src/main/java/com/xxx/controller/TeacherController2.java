package com.xxx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xxx.model.Teacher;
import com.xxx.service.ITeacherService;

@Controller
@RequestMapping(value="/teach")
public class TeacherController2 {
	
	@Autowired
	private ITeacherService teacherService;
	
	//添加老师的方法
	@RequestMapping(value="/add")
	public ModelAndView addTeacher(HttpServletRequest request,HttpServletResponse response,
			Teacher teacher) {
		teacherService.insert(teacher);
		ModelAndView mv = toTeacherPage();
		return mv;
	}
	
	//更新老师的方法
	@RequestMapping(value="/mod")
	public ModelAndView modTeacher(HttpServletRequest request,HttpServletResponse response,
			Teacher teacher){
		teacherService.update(teacher);
		ModelAndView mv = toTeacherPage();
		return mv;
	}
	
	//删除老师的方法---通过id来删除
	@RequestMapping(value="del/{id}")
	public ModelAndView delTeacherById(HttpServletRequest request,HttpServletResponse response,
			@PathVariable Integer id){
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(id);
		teacherService.delete(ids);
		return toTeacherPage();
	}
	
	//删除多个老师的方法
	@RequestMapping(value="del")
	public ModelAndView delMoreTeacherById(HttpServletRequest request,HttpServletResponse response
			){
		String[] ids = request.getParameterValues("ids");
		if (ids != null) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < ids.length; i++) {
				list.add(Integer.parseInt(ids[i]));
			}
			teacherService.delete(list);
		}else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("err_del", "未选择记录");
			mv.setViewName("/teacher/error");
			return mv;
		}
		return toTeacherPage();
	}
	
	//获取单个教师的方法
	@RequestMapping(value="getone/{id}")
	public ModelAndView getTeacherById(HttpServletRequest request,HttpServletResponse response,
			@PathVariable Integer id){
		Teacher teacher = teacherService.getOne(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("tec", teacher);
		mv.setViewName("/teacher/teachMod");
		return mv;
	}
	
	//获取所有教师的方法
	@RequestMapping(value="getall")
	public ModelAndView getAllTec(HttpServletRequest request,HttpServletResponse response){
		return toTeacherPage();
	}
	
	
	private ModelAndView toTeacherPage(){
		ModelAndView mv = new ModelAndView();
		List<Teacher> list = teacherService.getAllTeachers();
		mv.addObject("list", list);
		mv.setViewName("/teacher/teachMain");
		return mv;
	}
	
}
