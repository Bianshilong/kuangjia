<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		window.location.href = "/SpringmvcSpringMybatis/teach/addOrmod"
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
			</table>
			<input type="button" onclick="selectAll()" value="查询所有信息" />&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" onclick="addNew()" value="新增教师信息" />&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" id = "delAll" value="删除选中" />
		</form>
	</center>
</body>
</html>