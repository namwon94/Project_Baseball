<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

<title>KBO 승률 예측</title>

  <!-- Custom fonts for this template-->
  <link href="res/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Page level plugin CSS-->
  <link href="res/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="res/css/sb-admin.css" rel="stylesheet">

</head>
<body id="page-top">

  <nav class="navbar navbar-expand navbar-dark bg-dark static-top">

    <a class="navbar-brand mr-1" href="${pageContext.request.contextPath }">Sports - 무재칠시</a>

    <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
      <i class="fas fa-bars"></i>
    </button>

  </nav>

  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="sidebar navbar-nav">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="${pageContext.request.contextPath }" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <i class="fas fa-fw fa-folder"></i>
          <span>Board</span>
        </a>
        <div class="dropdown-menu" aria-labelledby="pagesDropdown">
      	  <h6 class="dropdown-header">Board:</h6>
          <a class="dropdown-item" href="${pageContext.request.contextPath }/kBoard.do">NBA승률예측</a>
          <a class="dropdown-item" href="">KBO승률예측</a>
          <a class="dropdown-item" href="">MLB승률예측</a>
          <a class="dropdown-item" href="">경기일정</a>
          <div class="dropdown-divider"></div>
        </div>
      </li>
    </ul>
    
       
    <div id="content-wrapper">     

     <div class="container-fluid">
     
     	<!-- Breadcrumbs-->
        <ol class="breadcrumb">
          <li class="breadcrumb-item active">KBO Board - WAR를 입력해주세요</li>
        </ol>
        <form action="${pageContext.request.contextPath }/kBoard_get.do"" method="get">
        <div>
        	Home Team : 
        	<select name="home_Team">
        		<option value="SK">SK</option>
        		<option value="두산">두산</option>
        		<option value="키움">키움</option>
        		<option value="LG">LG</option>
        		<option value="NC">NC</option>
        		<option value="KT">KT</option>
        		<option value="기아">기아</option>
        		<option value="삼성">삼성</option>
        		<option value="한화">한화</option>
        		<option value="롯데">롯데</option>
        	</select>
        </div>
        <div style="margin-top:20px;"> 
        	1번타자 : <input type="text" name="home_hitter1" />
        	<br /><br />
        	2번타자 : <input type="text" name="home_hitter2" />
        	<br /><br />
        	3번타자 : <input type="text" name="home_hitter3" />
        	<br /><br />
        	4번타자 : <input type="text" name="home_hitter4" />
        	<br /><br />
        	5번타자 : <input type="text" name="home_hitter5" />
        	<br /><br />
        	6번타자 : <input type="text" name="home_hitter6" />
        	<br /><br />
        	7번타자 : <input type="text" name="home_hitter7" />
        	<br /><br />
        	8번타자 : <input type="text" name="home_hitter8" />
        	<br /><br />
        	9번타자 : <input type="text" name="home_hitter9" />
        	<br /><br />
        	투수 : <input type="text" name="home_pitcher" />
        </div>
        <br /><br />
        
        <div>
        	Away Team : 
        	<select name="away_Team">  
        		<option value="SK">SK</option>
        		<option value="두산">두산</option>
        		<option value="키움">키움</option>
        		<option value="LG">LG</option>
        		<option value="NC">NC</option>
        		<option value="KT">KT</option>
        		<option value="기아">기아</option>
        		<option value="삼성">삼성</option>
        		<option value="한화">한화</option>
        		<option value="롯데">롯데</option>
        	</select>
        </div>
        <div style="margin-top:20px;"> 
        	1번타자 : <input type="text" name="away_hitter1" />
        	<br /><br />
        	2번타자 : <input type="text" name="away_hitter2" />
        	<br /><br />
        	3번타자 : <input type="text" name="away_hitter3" />
        	<br /><br />
        	4번타자 : <input type="text" name="away_hitter4" />
        	<br /><br />
        	5번타자 : <input type="text" name="away_hitter5" />
        	<br /><br />
        	6번타자 : <input type="text" name="away_hitter6" />
        	<br /><br />
        	7번타자 : <input type="text" name="away_hitter7" />
        	<br /><br />
        	8번타자 : <input type="text" name="away_hitter8" />
        	<br /><br />
        	9번타자 : <input type="text" name="away_hitter9" />
        	<br /><br />
        	투수 : <input type="text" name="away_hitter" />
        </div>
        <br />
        <input type="submit" value="입력" />
        </form>
          
      <!-- Sticky Footer -->
      <footer class="sticky-footer">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>무재칠시 2020</span>
          </div>
        </div>
      </footer>

     </div>
    <!-- /.content-wrapper -->

  </div>      
</body>
</html>