<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>登录</title>
	<style type="text/css">
		h1 {color:red;background-color:#d0e4fe;}
		form {color:blue;}
   </style>
</head>
<body style="background-color:gray;">
	<div align="center">
		<h1>Welcome My Shop</h1>
		<hr>
		<form action="login" method="post">
			用户名<input type="text" name="userName"><br>
			密&nbsp&nbsp&nbsp&nbsp码<input type="password" name="password"><br>
			<input type="submit" value="登录">
			<a href="register.jsp">注册</a>
		</form>

	</div>
</body>
</html>