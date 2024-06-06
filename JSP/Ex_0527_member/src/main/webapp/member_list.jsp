<%@page import="java.util.List"%>
<%@page import="dao.MemberDAO"%>
<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    MemberDAO dao = MemberDAO.getInstance();
    List<MemberVO> list = dao.selectList();
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function del(idx){
		if(!confirm("삭제하시겠습니까?")){
			return;
		}
		
		//location.hrdf로 보내는 이유 
		//form태그를 안썼기 때문에 submit()으로 보낼수가 없음
		location.href="member_del.jsp?idx="+idx;
	}
</script>
</head>
<body>
	<table border ="1">
		<caption>:::회원목록:::</caption>
			<tr>
				<td>회원번호</td>
				<td>이름</td>
				<td>아이디</td>
				<td>비밀번호</td>
				<td>이메일</td>
				<td>비고</td>	
			</tr>
			<%for(int i = 0; i < list.size(); i++){
				MemberVO mv = list.get(i);
				%>
				<tr>
					<td><%= mv.getIdx() %></td>
					<td><%= mv.getName() %></td>
					<td><%= mv.getId() %></td>
					<td><%= mv.getPwd() %></td>
					<td><%= mv.getEmail() %></td>
					<td>
						<input type="button" value="삭제" onclick="del('<%=mv.getIdx() %>')">
					</td>
				</tr>
				
			<%} %>
			<input type="button" value="추가" onclick="location.href='member_register_form.jsp'">
			
	</table>
</body>
</html>