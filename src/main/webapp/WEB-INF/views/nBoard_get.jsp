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
		
		<li>result : ${result }</li>
		
	</ul>
</body>
</html>