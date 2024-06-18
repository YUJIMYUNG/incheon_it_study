<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<caption> ::: 고객 목록 ::: </caption>
		<tr>
			<td>이름</td>
			<td>주소</td>
			<td>주민번호</td>
			<td>고객번호</td>
		</tr>
		<c:forEach var="vo" items="${list}">
		<tr>
			<td>${vo.goName}</td>
			<td>${vo.goAddr}</td>
			<td>${vo.goJumin}</td>
			<td>${vo.goDam}</td>
		</tr>
		</c:forEach>
</table>

</body>
</html>