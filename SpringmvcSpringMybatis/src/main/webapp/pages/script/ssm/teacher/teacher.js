/**
 * 教师组件
 */
SSM.namespace("TEC");
SSM.TEC = (function(){
	"use strict";
	var CONTEXT = ""; // URL的上下文，是否包含项目名，默认不包含，若包含修改之！
	
	// 获取项目上下问路径
	function getProjPath() {
		if (window.location.href.indexOf("SpringmvcSpringMybatis") > 0) {
			CONTEXT = "/SpringmvcSpringMybatis";
		}
	}
	
	function getTec(id) {
		if (!isNull(id)) {
			window.location.href= CONTEXT + "/teacher/getOne/" + id;
		}
	}
	
	function getTeachers() {
		getProjPath();
		$.ajax({
			type : 'POST',
			contentType : 'application/json',
			url : CONTEXT + '/teacher/getall',
			processData : false,
			dataType : 'json',
			data : '{}',
			success : function(data) {
				append2Dom(data);
			},
			error : function() {
				alert("出错了，保存失败，好好检查吧！！！")
			}
		});
	}
	
	function append2Dom(list) {
		if (isNull(list)) {
			return
		}else {
			var items = "";
			var title = "<tr><th>选择</th><th>编号</th><th>姓名</th><th>年龄</th>" +
					"<th>手机号码</th><th>性别</th><th>地址</th></tr>";
			for (var int = 0; int < list.length; int++) {
				var temp = "<tr><td><input type='text' name='ids' value='"+ list[i].id+"' /></td>"
							+"<td>"+list[i].tecId+"</td>"+"<td>"+list[i].tecName+"</td>"
							+"<td>"+list[i].tecAge+"</td>"+"<td>"+list[i].tecTell+"</td>"
							+"<td>"+list[i].tecSex+"</td>"+"<td>"+list[i].tecAddr+"</td></tr>"
				items = items +temp;
			}
			$("#mytecTable").empty();
			$("#mytecTable").append(title + items);
		}
	}
});