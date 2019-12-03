<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>智游客户关系管理系统 - 登录页面</title>
	<link rel="stylesheet" href="css/index.css">
</head>
<body>
<div class="login">
	<img src="${pageContext.request.contextPath}/z/logo.png" alt="智游">
	<p>智游客户关系管理系统</p>
	<form action="${pageContext.request.contextPath}/login" method="post">
	<div>
		<input type="text" id="accounts" name="accounts" value="" placeholder="请输入邮箱">
	</div>
	<div>
		<input type="password" id="password" name="password" value="" placeholder="请输入密码">
	</div>
	<div>
		<p class="error-message">${msg }</p>
		<input type="submit" value="登录">
	</div>
	</form>
</div>
<script>
	if (window.top !== window) {
		window.top.location.reload();
	}
</script>
</body>
</html>