package com.xxx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxx.service.ITeacherService;

@Controller
@RequestMapping(value="/teach")
public class TeacherController2 {
	
	@Autowired
	private ITeacherService teacherService;
	
	
	
}
