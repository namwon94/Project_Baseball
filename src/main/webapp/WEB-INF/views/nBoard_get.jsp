<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>타이틀</title>
</head>
<body>
	<h3>GET방식으로 전송된 검색 파라미터</h3>
	
	<ul>

		<li>home_WS : ${home_WS }</li>
		<li>home_VORP : ${home_VORP }</li>
		<li>home_BPM : ${home_BPM }</li>
		

		<li>away_WS : ${away_WS }</li>
		<li>away_VORP : ${away_VORP }</li>
		<li>away_BPM : ${away_BPM }</li>
		
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
 
<script>
$( document ).ready(function() {
    $.ajax({
        url:${pageContext.request.contextPath }'nBoard_get.do',
        type:'get',
        data: {
            Name:'ajax',
            Age:'10'
        },
        dataType:'text', // 리턴해주는 타입을 지정해줘야함
        beforeSend:function(jqXHR) {
            console.log("ajax호출전");
        },// 서버 요청 전 호출 되는 함수 return false; 일 경우 요청 중단
        success: function(data) {
            console.log("호출성공");
            console.log(JSON.parse(data));
        },// 요청 완료 시
        error:function(jqXHR) {
            console.log("실패입니다.");
        }// 요청 실패.
    });
});
</script>

		
	</ul>
</body>
</html>