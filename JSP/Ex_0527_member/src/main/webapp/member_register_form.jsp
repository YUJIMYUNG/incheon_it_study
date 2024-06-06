<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	funtion send(f){
		let name = f.name.value.trim(); //form태그에 name이라고 설정한 값을 name변수에 저장해라
		let id = f.id.value.trim();
		let pwd = f.pwd.value.trim();
		let email = f.email.value.trim();
		
		//유효성 검사
		if(name == ''){
			alert("이름을 입력하세요")
			return;//빠져나가기
		}
		
		f.method = "post";
		f.action = "member_rdg.jsp";
		f.submit();
	}
</script>
</head>
<body>
	<form>
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input name="name"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input name="pwd" type="password"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input name="email"></td> 
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="button" value="등록" onclick="send(this.form)">
				<input type="button" value="취소" onclick="location.href='member_list.jsp'">
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>