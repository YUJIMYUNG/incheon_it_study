<%@page import="java.sql.Connection"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//톰캣이 JNDI를 검색하기 위해 필요한 클래스(JNDI기법 : Java naming directory interface)
    	InitialContext ic = new InitialContext();
    
    	Context ctx = (Context)ic.lookup("java:comp/env");
    	
    	//lookup->찾는 함수 
    	//java:comp/env -> 자바에 내장되어잇는 리소스 자원을 검색 
    	
    	//검색된 Resource를 통해 JNDI의 자원을 검색 
    	//comtext.xml파일의 resource영역에 참조되어 있는 name의 속성값 
    	DataSource ds = (DataSource)ctx.lookup("jdbc/oracle_test");
    	
    	//위에서 준비해둔 경로로 로그인 시도
    	Connection conn = ds.getConnection();
    	
    	out.println("----- 디비 접속 성공 ----"); 
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>