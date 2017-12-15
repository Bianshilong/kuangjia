<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师组件(other)</title>
<script type="text/javascript">
	function selectAll() {
		window.location.href = "/SpringmvcSpringMybatis/teach/getall"
	}
	function addNew() {
		window.location.href = "/SpringmvcSpringMybatis/pages/jsp/teacher/teachAdd.jsp"
	}
</script>
</head>
<body>
	<center>教师信息</center>
	<center>
		<form action="<%=request.getContextPath() %>/teach/del" method="post">
			<!-- 根据页面查询信息来判断是否显示表格 -->
			<table id = "tab001" border="1" background="green" cellspacing="0">
				<tr>
					<th>选择</th>
					<th>编号</th>
					<th>姓名</th>
					<th>年龄</th>
					<th>手机号码</th>
					<th>性别</th>
					<th>地址</th>
					<th>操作</th>
				</tr>
				<c:forEach var="tec" items="${list }">
					<tr>
						<td>
							<input type="checkbox" name="ids" value="${tec.id }" />
						</td>
						<td>
							<a href="<%=request.getContextPath() %>/teach/getone/${tec.id}">${tec.tecId}</a>
						</td>
						<td>${tec.tecName}</td>
						<td>${tec.tecAge}</td>
						<td>${tec.tecTell}</td>
						<td>${tec.tecSex}</td>
						<td>${tec.tecAddr}</td>
						<td>
							<a href="<%=request.getContextPath() %>/teach/del/${tec.id}">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
			<input type="button" onclick="selectAll()" value="查询所有信息" />
			<input type="button" onclick="addNew()" value="新增教师信息" />
			<input type="submit" id = "delAll" value="删除选中" />
		</form>
	</center>
</body>
</html>