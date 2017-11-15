package com.bsl.test1;

public class Person {
	
	public Person() {
		System.out.println("---正在执行Person无参数的构造器---");
	}
	public 	void setTest(String name) {
		System.out.println("正在调用setName()方法，传入参数为："+name);
	}
}
