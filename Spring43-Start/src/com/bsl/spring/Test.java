package com.bsl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static ApplicationContext ctx;
	public static void print(Object object) {
		System.out.println(object);
	}
	
	public static void test1() {
		
		Users users = new Users();
		users.setName("student");
		users.setAddress("hefei");
		users.setMemo("this is my first spring project!");
		print(users);
	}
	public static void test2() {
		
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Users users = (Users) ctx.getBean("users");
		print(users);
	}
	
	public static void main(String[] args) {
		test1();
		test2();
	}
}
