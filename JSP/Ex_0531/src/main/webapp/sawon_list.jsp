<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function find(){
		//select태그의 value값 
		let deptno = document.getElementBuId("deptno").value;
		
		location.href = "sawon_list?deptno="+deptno
	}
</script>
</head>
<body>
	<div align="center">
		부서번호 : 
		<select id="deptno">
			<option value="0">:::부서를 선택하세요:::</option>
			<option value="10">총무부</option>
			<option value="20">영업부</option>
			<option value="30">전산실</option>
			<option value="40">관리부</option>
			<option value="50">경리부</option>
		</select>
		<input type="button" value="검색" onclick="find()">
		
	</div>	
	<table border="1">
		<caption> ::: 사원목록 ::: </caption>
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>직종</td>
			<td>입사일</td>
			<td>급여</td>
		</tr>
		<c:forEach var="vo" items="${list}">
		<tr>
			<td>${vo.sabun}</td>
			<td>${vo.saname}</td>
			<td>${vo.sajob}</td>
			<td>
			<c:set var="sahire", value="${vo.sahire}"/>
			${fn:split(sahire,'  ')[0]}</td>
			<td>${vo.sapay}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>