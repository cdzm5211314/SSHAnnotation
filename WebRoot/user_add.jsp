<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>添加图书</h1>
	<form action="${pageContext.request.contextPath}/user_add.action" method="post">
	姓名:<input type="text" name="name"><br>
	年龄:<input type="text" name="age"><br>
	性别:<input type="text" name="sex"><br>
	<input type="submit" value="添加">
	
	
	</form>
	
</body>
</html>