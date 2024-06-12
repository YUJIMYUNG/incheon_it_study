<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function send1(f){
		let name = f.name.value;
		let age = f.age.value;
		
		if(name== ''){
			alert("이름을 입력해주세요.");
			return
		}
		if(age== ''){
			alert("나이를 입력해주세요.");
			return
		}
		
		f.action = "insert1";
		f.method = "get";
		f.submit();
		
	}
	
	function send2(f){
		f.action = "insert2";
		f.method = "get";
		f.submit();
	}
</script>
</head>
<body>
	<form>
		<table border="1" align="center">
			<caption>::: 개인정보 인력 :::</caption>
			<tr>
				<td>이름</td>
				<td><input name ="name"></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input name ="age"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="button" value="낱개로 받기" onclick="send1(this.form)">
				<input type="button" value="객체로 받기" onclick="send2(this.form)">
				</td>
			</tr>
			
			
		</table>
	</form>	
</body>
</html>