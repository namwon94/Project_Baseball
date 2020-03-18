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

<title>NBA 승률 예측</title>

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
          <a class="dropdown-item" href="${pageContext.request.contextPath }/nBoard.do">NBA승률예측</a>
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
          <li class="breadcrumb-item active">MLB Board </li>
          <li class="breadcrumb-item active">타자 : WAR, SLG, OBP 입력</li>
          <li class="breadcrumb-item active">투수 : WAR, ERA, WHIP 입력 </li>
        </ol>
        <form action="${pageContext.request.contextPath }/mBoard_get.do"" method="get">
        <div class="row">
	        <div class="col-xl-3 col-sm-6 mb-3">
	        	Home Team : 
	        	<select name="home_Team">
	        		<option value="HOU">MIA</option>
	        		<option value="STL">STL</option>
	        		<option value="PIT">PIT</option>
	        		<option value="BAL">BAL</option>
	        		<option value="DET">DET</option>
	        		<option value="BOS">BOS</option>
	        		<option value="NYY">NYY</option>
	        		<option value="LAA">LAA</option>
	        		<option value="TEX">TEX</option>
	        		<option value="MIL">MIL</option>
	        		<option value="CHC">CHC</option>
	        		<option value="ARI">ARI</option>
	        		<option value="CHW">CHW</option>
	        		<option value="CLE">CLE</option>
	        		<option value="ATL">ATL</option>
	        		<option value="IND">IND</option>
	        		<option value="PHI">PHI</option>
	        		<option value="SEA">SEA</option>
	        		<option value="TOR">TOR</option>
	        		<option value="MIA">MIA</option>
	        		<option value="COL">COL</option>
	        		<option value="SF">SF</option>
	        		<option value="MIN">MIN</option>
	        		<option value="KC">KC</option>
	        		<option value="LAD">LAD</option>
	        		<option value="CIN">CIN</option>
	        		<option value="OAK">OAK</option>
	        		<option value="SD">SD</option>
	        		<option value="WSH">WSH</option>
	        		<option value="NYM">NYM</option>
	        	</select>
	        </div>
	        <div class="col-xl-3 col-sm-6 mb-3"> 
	        	home_OBP : <input type="text" name="home_OBP" />
	        	<br /><br />
	        	home_SLG : <input type="text" name="home_SLG" />
	        	<br /><br />
	        	home_WAR_b : <input type="text" name="home_WAR_b" />
	        	<br /><br />
	        	home_ERA : <input type="text" name="home_ERA" />
	        	<br /><br />
	        	home_WHIP : <input type="text" name="home_WHIP" />
	        	<br /><br />
	        	home_WAR_p : <input type="text" name="home_WAR_p" />
	        	<br /><br />
	        </div>
	        <br /><br /><br /><br /><br /><br /><br />
	        
	        <div class="col-xl-3 col-sm-6 mb-3">
	        	Away Team : 
	        	<select name="away_Team">  
	        		<option value="HOU">MIA</option>
	        		<option value="STL">STL</option>
	        		<option value="PIT">PIT</option>
	        		<option value="BAL">BAL</option>
	        		<option value="DET">DET</option>
	        		<option value="BOS">BOS</option>
	        		<option value="NYY">NYY</option>
	        		<option value="LAA">LAA</option>
	        		<option value="TEX">TEX</option>
	        		<option value="MIL">MIL</option>
	        		<option value="CHC">CHC</option>
	        		<option value="ARI">ARI</option>
	        		<option value="CHW">CHW</option>
	        		<option value="CLE">CLE</option>
	        		<option value="ATL">ATL</option>
	        		<option value="IND">IND</option>
	        		<option value="PHI">PHI</option>
	        		<option value="SEA">SEA</option>
	        		<option value="TOR">TOR</option>
	        		<option value="MIA">MIA</option>
	        		<option value="COL">COL</option>
	        		<option value="SF">SF</option>
	        		<option value="MIN">MIN</option>
	        		<option value="KC">KC</option>
	        		<option value="LAD">LAD</option>
	        		<option value="CIN">CIN</option>
	        		<option value="OAK">OAK</option>
	        		<option value="SD">SD</option>
	        		<option value="WSH">WSH</option>
	        		<option value="NYM">NYM</option>
	        	</select>
	        </div>
	        <div class="col-xl-3 col-sm-6 mb-3"> 
	        	away_OBP : <input type="text" name="away_OBP" />
	        	<br /><br />
	        	away_SLG : <input type="text" name="away_SLG" />
	        	<br /><br />
	        	away_WAR_b : <input type="text" name="away_WAR_b" />
	        	<br /><br />
	        	away_ERA : <input type="text" name="away_ERA" />
	        	<br /><br />
	        	away_WHIP : <input type="text" name="away_WHIP" />
	        	<br /><br />
	        	away_WAR_p : <input type="text" name="away_WAR_p" />
	        </div>
	        <br />
	        <input type="submit" value="입력" />
	    </div>
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