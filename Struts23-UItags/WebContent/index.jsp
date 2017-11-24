<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags"  prefix="s"%>
    <%@page import="java.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--跳转populateRegister.action是为了初始化成员变量  -->
<meta http-equiv="Refresh" content="3;URL=populateRegister.action">
<title>Insert title here</title>
</head>
<body>
	<h2>你只能看到次页面3秒，要珍惜哦！！</h2>
	<%-- <s:property value="new Date()"/> --%>
	<%=new Date() %>
	<%-- <s:property value="#fib =:[#this==0 ? 0 : #this==1 ? 1 :
		#fib(#this-2)+ #fib(#this-1)],#fib(11)"/> --%>
	<%-- <table>
		<s:iterator value="{'疯狂Java讲义'，‘轻量级Java EE 企业应用实战’,'疯狂IOS讲义'}" id="name">
			<tr>
				<td><s:property value="$st.count"/>
				<s:property value="name"/></td>
			</tr>
		</s:iterator>
	</table> --%>
</body>
</html>