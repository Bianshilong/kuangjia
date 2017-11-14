package com.bsl.spring.set;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//构造注入
public class BoyConstructor {
	
	private static Logger logger = Logger.getLogger(BoyConstructor.class);
	
	//声明接口类型的引用，和具体实现类解耦合
	private GirlFriend girlFriend;
	private static ApplicationContext ctx;
	public BoyConstructor() {
	}
	//用于为GirlFriend属性赋值的构造方法
	public BoyConstructor(GirlFriend girlFriend) {
		this.girlFriend=girlFriend;
	}
	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("applicationContext-set.xml");
		BoyConstructor boy = (BoyConstructor) ctx.getBean("boyConstructor");
		logger.info(boy.girlFriend.speak());
	}
	
	
}
