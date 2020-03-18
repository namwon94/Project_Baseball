# Project_Baseball

https://github.com/Woosub-Kim/sports_predict_api

프로 스포츠(NBA, KBO, MLB)의 데이터 기반 승률예측 spring기반 웹페이지 구현(승률예측은 위의 주소로 들어가서 api를 써야함) 
<br/>
밑의 데이터를 이용함
<br/>
NBA - WS, VORP, BPM
<br/>
KBO - WAR
<br/>
MLB - ERA, WHIP, WAR, SLG, OBP
<br/>
spring이용(Ecilpse 사용) -> @Controller, @ModelAndView, @RequestMapping 사용(웹페이지 구현) -> get방식으로 데이터를 보낸 후 ->
JSON Type으로 home팀이 이기는지 away팀이 이기는지 받아온다 -> String으로 형변환 후 웹페이지에 승리 팀을 
<br/>
<img width="" height="" src='https://github.com/namwon94/Project_Baseball/blob/master/webpage.png'></img>
