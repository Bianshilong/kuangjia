package com.bsl.train.strut2.login;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class LoginAction {
	private String username;
	private String password;
	//成员属性既可以封装前端页面form中的参数,也可以封装后端处理的结果(如:数据库查询来的结果)
	//也可以被页面用EL表达式输出;
	
	public String execute() throws Exception{
		if (this.getUsername().equals("admin")&&this.getPassword().equals("password")) {
			return "success";
		}
		return "error";
		
	}
}
