package com.bsl.lesson3;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction implements Action {
	private String username;
	private String password;

	// username的setter和getter方法
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getUsername()
	{
		return this.username;
	}

	// password的setter和getter方法
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return this.password;
	}

	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		// 通过ActionContext访问application范围的属性值
		Integer counter = (Integer)ctx.getApplication()
			.get("counter");
		if (counter == null)
		{
			counter = 1;
		}
		else
		{
			counter = counter + 1;
		}
		// 通过ActionContext设置application范围的属性
		ctx.getApplication().put("counter" , counter);
		// 通过ActionContext设置session范围的属性
		ctx.getSession().put("user" , getUsername());
		if (getUsername().equals("crazyit.org")
			&& getPassword().equals("leegang") )
		{
			// 通过ActionContext设置request范围的属性
			ctx.put("tip" , "服务器提示：您已经成功的登录");
			return SUCCESS;
		}
		// 通过ActionContext设置request范围的属性
		ctx.put("tip" , "服务器提示：登录失败");
		return ERROR;
	}

}
