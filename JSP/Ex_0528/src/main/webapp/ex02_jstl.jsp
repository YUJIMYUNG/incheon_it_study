<%@page import="java.util.Date"%>
<%@page import="vo.PersonVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
	List<PersonVO> list = new ArrayList<>();
	list.add(new PersonVO("홍길동",20));
	list.add(new PersonVO("박길동",20));
	request.setAttribute("list",list);
	
	int money = 12000000;
	Date today = new Date();
	
	request.setAttribute("money", money);
	request.setAttribute("today", today);
	
	String str = "Kim Mal DDong";
	
	request.setAttribute("str", str);
	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="vo" items="${list }">
		${vo.name } / ${vo.age }<br>
	</c:forEach>
	
	<hr>
	
	&#8361;<fmt:formatNumber value="${money }"/><br>
	<fmt:formatDate value="${today }"/><br>
	<fmt:formatDate value="${today }" pattern="yyyy년MM월dd일"/><br>
	<!--  MM:월  DD:1월, 1일부터 현재까지 일수,  dd: 현재 달의 일,  mm: 분 -->
	
	<hr>
	
	<!--  fn은 단독으로 쓸 수 없고 el표현식과 같이 사용해야 한다. -->
	문자열의 길 : ${fn:length(str) } <br>
	글자의 인덱스값 반환 : ${fn:indexOf(str,"M") }<br>
	문자열 자르기 : ${fn:split(str," ")[0] }<br>
	
	
</body>
</html>