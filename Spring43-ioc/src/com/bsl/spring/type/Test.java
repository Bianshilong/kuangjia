package com.bsl.spring.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		
		ctx = new ClassPathXmlApplicationContext("applicationContext-type.xml");
		DataType empty = (DataType) ctx.getBean("dataType");
		empty.printValue();
	}

}
