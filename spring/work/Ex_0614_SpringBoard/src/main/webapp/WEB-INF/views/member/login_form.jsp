<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function send(f){
		let id = f.id.value.trim();
		let pwd = f.pwd.value.trim();
		
		if(id== ''){
			alert('아이디를 입력하세요.');
			return;
		}
		if(pwd==''){
			alert('비밀번호를 입력하세요.')
			return;
		}
		
		let url = "login"
		let bodyform = "id="+id+"&pwd="+pwd;
		
		fetch(url,{
			method:'post',
			headers:{'Content-Type':'application/x-www-form-urlencoded'},
			body: bodyform
		})
		.then(response => response.json())
		.then(data => {
			if(data.param === 'yes'){
				alert('로그인 성공')
				location.hrdf='bord_list';
			} else if(data.param === 'no'){
				alert('아이디나 비밀번호가 잘못 됐습니다.')
			}	else{
				alert('오류가 발생했습니다.')
			}
			
			
		})
	}//send
</script>
</head>
<body>
	<form>
		<table border="1" align="center">
			<caption>:::로그인:::</caption>
			<tr>
				<td>아이디</td>
				<td><input name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input name="pwd" type="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="로그인" onclick="send(this.form)">
					<input type="button" value="회원가입" onclick="'location.href='register_form'">
					<input type="button" value="취소" onclick="'location.href='board_list'">
				</td>
			</tr>
			
			
		</table>
	</form>
</body>
</html>