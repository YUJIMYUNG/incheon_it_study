<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	input{border : none;}
</style>
<script type="text/javascript">
	//게시글 추가하기
	//서블릿 : BoardInsertAction
	//매핑 : insert.do
	//빈칸으로 비워두면 경고창 띄우고 못넘어가게 하기
	//작성자의 ip 받는법 request.getRemoteAddr();
	
	function send_check(){
		let f = document.f;
		
		
		//했다쳐
		
		f.submit();
		

	}




</script>
</head>
<body>
	<form name="f" method="post" action="insert.do">
		<table border="1">
			<caption>:::새 글 쓰기:::</caption>
			<tr>
				<th>제목</th>
				<td><input name="subject"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input name="name"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="content" rows="10" cols="50" style="resize:none;"></textarea></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input name="pwd" type="password"></td>
			</tr>
			<tr>
				<td colspan="2">
					<img src="resources/img/btn_reg.gif" onclick="send_check()">
					<img src="resources/img/btn_back.gif" onclick="location.href='board_list'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>



