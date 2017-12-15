<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新组件</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/pages/script/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/pages/script/common.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/pages/script/ssm/ssmnamespace.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/pages/script/ssm/teacher/teacher.js"></script>
</head>
<body>
	<center>修改教师信息</center>
	<hr/>
	<center>
		<form action="<%=request.getContextPath()%>/teacher/mod" method="post">
			<input id="id" type="hidden" name="id" value="${tec.id }"  />
			<table>
				<tr>
					<td><span>编号:</span></td>
					<td><input id="tecId" name="tecId" type="text" value="${tec.tecId }"/></td>
				</tr>
				<tr>
					<td><span>姓名:</span></td>
					<td><input id="tecName" name="tecName" type="text" value="${tec.tecName }"/></td>
				</tr>
				<tr>
					<td><span>年龄:</span></td>
					<td><input id="tecAge" name="tecAge" type="text" value="${tec.tecAge }"/></td>
				</tr>
				<tr>
					<td><span>手机号码:</span></td>
					<td><input id="tecTell" name="tecTell" type="text" value="${tec.tecTell }"/></td>
				</tr>
				<tr>
					<td><span>性别:</span></td>
					<td><input id="tecSex" name="tecSex" type="text" value="${tec.tecSex }"/></td>
				</tr>
				<tr>
					<td><span>地址:</span></td>
					<td><input id="tecAddr" name="tecAddr" type="text" value="${tec.tecAddr }"/></td>
				</tr>
				<tr>
					<td>
						<input id = "tecSaveBtn" type="button" value="提交" />
						<input id = "tecCancelBtn" type="button" value="返回" />
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>