<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<s:form>
		<s:checkboxlist name="b" label="请选择你想选择的出版日期"
		labelposition="top" list="#{'疯狂Java讲义':'2008年9月',
		'轻量级Java EE 企业应用实战':'2008年12月',
		'疯狂IOS讲义':'2014年1月' }" listKey="key" listValue="value" />
	<s:select name="sc" label="请选择您喜欢的图书" labelposition="top" multiple="true" size="7"
	list="{'疯狂Java讲义','轻量级Java EE 企业应用实战',	'疯狂IOS讲义' }"></s:select>
	</s:form>
	
</body>
</html>