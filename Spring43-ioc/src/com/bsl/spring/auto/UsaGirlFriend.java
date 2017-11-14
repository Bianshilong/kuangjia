package com.bsl.spring.auto;

import org.springframework.stereotype.Component;
/*
 * Component代表一种组件
 * @author ssyy
 */
//@Service("usaGirlFriend")
//@Controller("usaGirlFriend")
//@Repository("usaGirlFriend")
@Component("usaGirlFriend")
public class UsaGirlFriend {
	public String speak() {
		return "english";
	}

}
