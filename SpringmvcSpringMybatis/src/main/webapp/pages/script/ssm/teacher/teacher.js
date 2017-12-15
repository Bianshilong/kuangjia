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
	
	//获取所有教师的方法
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
			for (var i = 0; i < list.length; i++) {
				var temp = "<tr><td><input type='checkbox' name='ids' value='"+ list[i].id+"' /></td>"
							+"<td>"+list[i].tecId+"</td>"+"<td>"+list[i].tecName+"</td>"
							+"<td>"+list[i].tecAge+"</td>"+"<td>"+list[i].tecTell+"</td>"
							+"<td>"+list[i].tecSex+"</td>"+"<td>"+list[i].tecAddr+"</td></tr>"
				items = items +temp;
			}
			$("#mytecTable").empty();
			$("#mytecTable").append(title + items);
		}
	}
	
	//添加或更新教师的方法，有id为更新，无id为保存
	function saveTec(id) {
		var requesturl = CONTEXT + "/teacher/addOrmod";
		var reqdata;
		if (isNull(id)) {
			reqdata = '{"tecId":"'+$('#tecId').val()+'","tecName":"'+$('#tecName').val()
					+'","tecAge":"'+$('#tecAge').val()+'","tecTell":"'+$('#tecTell').val()
					+'","tecSex":"'+$('#tecSex').val()+'","tecAddr":"'+$('#tecAddr').val()
					+'"}'
		}else {
			reqdata = '{"tecId":"'+$('#tecId').val()+'","tecName":"'+$('#tecName').val()
			+'","tecAge":"'+$('#tecAge').val()+'","tecTell":"'+$('#tecTell').val()
			+'","tecSex":"'+$('#tecSex').val()+'","tecAddr":"'+$('#tecAddr').val()
			+'","id":"'+$('#id').val()+'"}'
		}
		
		$.ajax({
			type: 'POST',
			contentType: 'application/json',
			url: requesturl,
			processData: false,
			dataType: 'json',
			data :reqdata,
			success: function(data) {
				//返回主页面
				window.location.href = CONTEXT + "/pages/jsp/teacher/teacherMain.jsp";
			},
			error : function() {
				alert("出错了，保存失败，好好检查吧！！！");
			}
		});
	}
	
	//删除教师
	function delTec(ids) {
		$.ajax({
			type : 'POST',
			contentType: 'application/json',
			url: CONTEXT + "/teacher/del",
			processData: false,
			dataType: 'json',
			data : '{"ids":"'+ids+'"}',
			success: function() {
				window.location.href = CONTEXT + "/pages/jsp/teacher/teacherMain.jsp";
			},
			error : function() {
				alert("出错了，删除失败，好好检查吧！！！");
			}
		})
	}
	//新增按钮的跳转页面
	function OpenAddOrModPage(){
		window.location.href = CONTEXT + "/pages/jsp/teacher/teacherMod.jsp";
	}	
	//添加页面的取消按钮
	function tecSaveCancel() {
		window.location.href = CONTEXT + "/pages/jsp/teacher/teacherMain.jsp";
	}
	//将当前保存的字段或方法提供给外界调用
	return{
		CONTEXT: CONTEXT,
		saveTec:saveTec,
		delTec:delTec,
		getTec:getTec,
		getTeachers:getTeachers,
		OpenAddOrModPage:OpenAddOrModPage,
		tecSaveCancel:tecSaveCancel
	};
	
})();

$(function() {
	//实现页面载入后，自动插叙所有数据
	window.onload = SSM.TEC.getTeachers();
	
	//新增按钮
	$('#tecAddBtn').click(function() {
		SSM.TEC.OpenAddOrModPage();
	});
	//修改按钮
	$('#tecModBtn').click(function() {
		//获取选择的checkbox
		var ids = [];
		$('#mytecTable :input:checked').each(function(){
			ids.push($(this).val());
		});
		if (isNull(ids) || ids.length>1) {
			alert("请选择一条记录更新！");
		}else {
			SSM.TEC.getTec(ids[0]);
		}
	});
	//保存按钮
	$('#tecSaveBtn').click(function() {
		//判断是否存在id,以确定是更新还是添加
		var id= $('#id').val();
		if (isNull(id)) {
			SSM.TEC.saveTec();
		}else {
			SSM.TEC.saveTec(id);
		}
	});
	//取消按钮
	$('#tecCancelBtn').click(function() {
		SSM.TEC.tecSaveCancel();
	});
	//删除按钮
	$('#tecDelBtn').click(function() {
		var ids = [];
		$('#mytecTable :input:checked').each(function(){
			ids.push($(this).val());
		});
		if (isNull(ids) || ids.length < 1) {
			alert("你傻啊，不选择怎么删除！！")
		}else {
			SSM.TEC.delTec(ids);
		}
	});
	//查询所有教师
	$('#tecGetBtn').click(function() {
		SSM.TEC.getTeachers();
	});
});

