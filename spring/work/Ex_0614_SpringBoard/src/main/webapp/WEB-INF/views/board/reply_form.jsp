<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//2. reply 매핑을 갖고있는 Controlloer로 이동하여 답글 추가하기 기능 만들기
	//2-1. idx를 가지고 기준이 되는 게시글 한 건 조회하기
	//2-2. step값 증가시키기 
	//2-3. 답글 추가하기 
	function send_check(){
		let f = document.f;
		f.submit();
	}

</script>
</head>
<body>
	<form name="f" method="post" action="reply">
		<input type="hidden" name="idx" value="${param.idx}">
		<input type="hidden" name="page" value="${param.page}">
		<table border="1">
			<caption>:::답 글 쓰기:::</caption>
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
					<img src="resources/img/btn_back.gif" onclick="location.href='board_list?page=${param.page}'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>