<%@page import="vo.SawonVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int no = Integer.parseInt(request.getParameter("deptno"));
	InitialContext ic = new InitialContext();
	Context ctx = (Context)ic.lookup("java:comp/env");	
	DataSource ds = (DataSource)ctx.lookup("jdbc/oracle_test");
	Connection conn = ds.getConnection();
	
	String sql = "select * form sawon where deptno=" +no;
	
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	ResultSet rs = pstmt.executeQuery();
	
	List<SawonVO> sawon_list = new ArrayList<>();
	
	while(rs.next()){
		SawonVO vo = new SawonVO();
		
		vo.setDeptno(rs.getInt("deptno"));
		vo.setSabun(rs.getInt("sabun"));
		vo.setSaname(rs.getString("saname"));
		vo.setSapay(rs.getInt("sapay"));
		
		sawon_list.add(vo);
		
	}
	
	rs.close();
	pstmt.close();
	conn.close();
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>급여</td>
			<td>부서번호</td>
		</tr>
		<%for(int i = 0; i < sawon_list.size(); i++){ %>
		<tr>
			<td><%=sawon_list.get(i).getDeptno() %></td>
			<td><%=sawon_list.get(i).getSabun() %></td>
			<td><%=sawon_list.get(i).getSaname() %></td>
			<td><%=sawon_list.get(i).getSapay() %></td>
		</tr>
		<%} %>
		
	</table>
</body>
</html>