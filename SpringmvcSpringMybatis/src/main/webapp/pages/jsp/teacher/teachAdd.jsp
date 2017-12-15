<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增教师</title>
<script type="text/javascript">
	$('#tecCancelBtn')
			.click(
					function() {
						window.location.href = "/SpringmvcSpringMybatis/pages/jsp/teacher/teachMain.jsp";
					});
</script>
</head>
<body>
	<center>
		<form action="<%=request.getContextPath()%>/teach/add" method="post">
			<table>
				<tr>
					<td><span>编号:</span></td>
					<td><input id="tecId" name="tecId" type="text" /></td>
				</tr>
				<tr>
					<td><span>姓名:</span></td>
					<td><input id="tecName" name="tecName" type="text" /></td>
				</tr>
				<tr>
					<td><span>年龄:</span></td>
					<td><input id="tecAge" name="tecAge" type="text" /></td>
				</tr>
				<tr>
					<td><span>手机号码:</span></td>
					<td><input id="tecTell" name="tecTell" type="text" /></td>
				</tr>
				<tr>
					<td><span>性别:</span></td>
					<td><input id="tecSex" name="tecSex" type="text" /></td>
				</tr>
				<tr>
					<td><span>地址:</span></td>
					<td><input id="tecAddr" name="tecAddr" type="text" /></td>
				</tr>
				<tr>
					<td><input id="tecSaveBtn" type="button" value="提交" /> <input
						id="tecCancelBtn" type="button" value="返回" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>