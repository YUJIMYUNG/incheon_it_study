<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${requestScope.msg}
	<!-- 영역 참조 순서
	1. pageContext
	2 request
	3. sission
	4. application -->
	${msg}
	
</body>
</html>