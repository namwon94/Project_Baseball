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
		<li>home_OBP : ${home_OBP }</li>
		<li>home_SLG : ${home_SLG }</li>
		<li>home_WAR_b : ${home_WAR_b }</li>				
		<li>home_ERA : ${home_ERA }</li>
		<li>home_WHIP : ${home_WHIP }</li>
		<li>home_WAR_p : ${home_WAR_p }</li>

		

		<li>away_OBP : ${away_OBP }</li>
		<li>away_SLG : ${away_SLG }</li>
		<li>away_WAR_b : ${away_WAR_b }</li>				
		<li>away_ERA : ${away_ERA }</li>
		<li>away_WHIP : ${away_WHIP }</li>
		<li>away_WAR_p : ${away_WAR_p }</li>

	</ul>
</body>
</html>