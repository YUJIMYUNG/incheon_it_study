<%@page import="vo.PersonVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	List<PersonVO> list = new ArrayList<>();
    
		list.add(new PersonVO("홍길동", 20, "010-1111-1111"));
		list.add(new PersonVO("김길동", 30, "010-2222-2222"));
		list.add(new PersonVO("박길동", 40, "010-3333-3333"));
		list.add(new PersonVO("이길동", 50, "010-4444-4441"));
		list.add(new PersonVO("조길동", 60, "010-5555-5555"));
		
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1">
		<caption>::: 개인정보 목록 :::</caption>
		<tr>
			<td>이름</td>
			<td>나이</td>
			<td>전화번호</td>
			
		</tr>
		<%for(int i = 0; i< list.size(); i++){ %>
			<tr>
				<td><%= list.get(i).getName() %></td>
				<td><%= list.get(i).getAge() %></td>
				<td><%= list.get(i).getTel() %></td>
			</tr>
		<%} %>	
		
	</table>
</body>
</html>