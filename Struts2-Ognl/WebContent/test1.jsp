<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form>
		<s:textfield required="required"></s:textfield>
		<s:submit value="提交"></s:submit>
	</s:form>
	
	<s:property value="#fib =:[#this==0 ? 0 : #this==1 ? 1 : #fib(#this-2)+ #fib(#this-1)], #fib(11)"/>
	<s:property value="#fib(11)"/>
</body>
</html>