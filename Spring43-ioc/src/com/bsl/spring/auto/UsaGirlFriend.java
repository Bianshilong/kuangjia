package com.bsl.spring.auto;

import org.springframework.stereotype.Component;
/*
 * Component代表一种组件
 * @author ssyy
 * 以下四个组件功能一致，都是把当前类的对象放入到Spring容器中
 * ()可以是空，默认为类名首字母小写；也可以自己定义，为@Resource(name="")来使用
 */
//@Controller("usaGirlFriend")
//@Service("usaGirlFriend")
//@Repository("usaGirlFriend")
@Component("usaGirlFriend")
public class UsaGirlFriend {
	public String speak() {
		return "language---->english";
	}
	public String speak(String str) {
		return str;
	}
	@Override
	public String toString() {
		return "UsaGirlFriend []";
	}
	
	
//	//控制台打印输出
//	public void speak() {
//		System.out.println("language---->english");
//	}

}
