<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="UTF-8">
<title>テスト初期化3</title>
</head>
<body>
	<div>
		<font size="5">Hello!</font> <c:out value='${testForm.userName}' /> 
	</div>
</body>
</html>