<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/httpRequest.js"></script>
<script type="text/javascript">
	function send(){
		let dan = document.getElementById("dan").value;
		let url = "gugudan_ajax.jsp";
		let param = "dan="+dan;
		
		sendRequest(url,param,resultFn,"get");
	}
	
	function resultFn(){
		//alert("call back");
		
		//readyState : XMLHttpRequest 객체의 상태를 보여주는 프로퍼티
		//UNSENT(숫자0) : XMLHttpRequest객체가 생성됨 
		//OPEND(숫자1) : open()메서드가 성공적으로 실행됨 
		//HEADERS_RECEIVED(숫자 2) : 모든 요청에 대한 응답이 도착함 
		//LOADING(숫자3) : dycjdgks epdlxjfmf cjflwnddla 
		//DONE(숫자4): 요청한 데이터의 처리가 완료되어 응답할 준비가 완료됨 
		
		//status : 서버이 문서 상태를 나타낸다. 
		//200 : 통신 성공
		//404 : 문서가 없음 
		//500 : 서버가 잘못됨
		
		//consol.log(xhr.readyState + " / " + xhr.status);
		
		let data = xhr.responseText; // 최종결과값을 갖고 돌아온다. 
		
		//console.log(data);
		
		document.getElementById("disp").innerHTML = data;
		
	}
</script>
</head>
<body>
	단 : <input id="dan">
	<input type="button" value="결과보기" onclick="send()">
	<br>
	<div id="disp"></div>
</body>
</html>