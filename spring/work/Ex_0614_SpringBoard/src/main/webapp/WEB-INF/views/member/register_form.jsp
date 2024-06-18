<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//매핑 : member_insert
	//httpMethod : post
	
	let b_idCheck = false;
	
	function send(f){
		//유효성 검사 
		f.method = 'post';
		f.action = 'member_insert'
		f.submit();
		
	}
	
	function check_id(){
		let id = document.getElementById("id").value;
		
		if(id==''){
		 	alert('아이디를 입력하세요.')
		 	return;
		}
		
		let url = 'check_id'
		let bodyForm = 'id='+id
		
		fetch(url, {
			method : 'post',
			headers : {'Content-Type' : 'application/x-www-form-urlencoded'},
			body : bodyForm
		})
		.then(response => response.json())
		.then(data =>{
			if(data.param === 'no'){
				alert('이미 사용중인 id입니다.')
				return;
				} else if(data.param === 'yes'){
					alert('사용 가능한 id입니다.')
					b_idCheck = true;		
				}
			})
	}
</script>
</head>
<body>
	<form>
		<table border="1">
			<caption>:::회원가입:::</caption>
			<tr>
				<td>아이디</td>
				<td> <input name="id" id="id">
					<input type="button" value="중복체크" onclick="check_id()">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td> <input name="pwd" type="password">
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td> <input name="name"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td> <input name="email"></td>
			</tr>
			<tr>
				<td colspan="2" aligh="center">
					<input type="button" value="가입" onclick="send(this.form)">
					<input type="button" value="취소" onclick="location.href='board_list'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>