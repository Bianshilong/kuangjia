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
	<table border="1" width="300">
		<!-- 迭代输出List集合 -->
		<s:iterator value="{'疯狂Java讲义','轻量级Java EE 企业应用实战','疯狂IOS讲义'}" 
			id="name" status="st">
			<tr	<s:if test="#st.odd">style="background-color:#bbbbbb"</s:if>>
				<td><s:property value="name"/></td>
			</tr>
		</s:iterator>
	</table>
	<br/>
	<hr/>
	<br/>
	<table border="1" width="350">
		<tr>
			<th>书名</th>
			<th>作者</th>
		</tr>
	<!-- 对指定的Map对象进行迭代输出，并指定status属性 -->
	<s:iterator value="#{'疯狂Java讲义':'李刚',
		'轻量级Java EE 企业应用实战':'李刚',
		'疯狂IOS讲义':'李刚'}" id="score" status="st">
		<!-- 根据当前被迭代元素的索引是否为奇数来决定是否使用背景色 -->
			<tr	<s:if test="#st.odd">style="background-color:#bbbbbb"</s:if>>
				<!--输出Map对象里Entry的key  -->
				<td><s:property value="key"/></td>
				<!--输出Map对象里Entry的value  -->
				<td><s:property value="value"/></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>