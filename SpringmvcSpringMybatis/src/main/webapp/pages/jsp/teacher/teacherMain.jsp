<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师管理组件</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/pages/script/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/pages/script/common.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/pages/script/ssm/ssmnamespace.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/pages/script/ssm/teacher/teacher.js"></script>
</head>
<body>
	<center>教师管理</center>
	<center>
		<table id="mytecTable" border="1" bordercolor="green" cellspacing="0" >
			
		</table>
	</center>
	<center>
		<table>
			<tr>
				<td><input id="tecAddBtn" type="button" value="新增教师" /></td>
				<td><input id="tecModBtn" type="button" value="更新教师" /></td>
				<td><input id="tecDelBtn" type="button" value="删除教师" /></td>
				<td><input id="tecGetBtn" type="button" value="查询教师" /></td>
			</tr>
		</table>
	</center>
</body>
</html>