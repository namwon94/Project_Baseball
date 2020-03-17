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
        <div>
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
        <div style="margin-top:20px;"> 
        	1번타자 : <input type="text" name="hWar1" />&nbsp;&nbsp; <input type="text" name="hSLG1" />&nbsp;&nbsp; <input type="text" name="hOBP1" />
        	<br /><br />
        	2번타자 : <input type="text" name="hWar2" />&nbsp;&nbsp; <input type="text" name="hSLG2" />&nbsp;&nbsp; <input type="text" name="hOBP2" />
        	<br /><br />
        	3번타자 : <input type="text" name="hWar3" />&nbsp;&nbsp; <input type="text" name="hSLG3" />&nbsp;&nbsp; <input type="text" name="hOBP3" />
        	<br /><br />
        	4번타자 : <input type="text" name="hWar4" />&nbsp;&nbsp; <input type="text" name="hSLG4" />&nbsp;&nbsp; <input type="text" name="hOBP4" />
        	<br /><br />
        	5번타자 : <input type="text" name="hWar5" />&nbsp;&nbsp; <input type="text" name="hSLG5" />&nbsp;&nbsp; <input type="text" name="hOBP5" />
        	<br /><br />
        	6번타자 : <input type="text" name="hWar6" />&nbsp;&nbsp; <input type="text" name="hSLG6" />&nbsp;&nbsp; <input type="text" name="hOBP6" />
        	<br /><br />
        	7번타자 : <input type="text" name="hWar7" />&nbsp;&nbsp; <input type="text" name="hSLG7" />&nbsp;&nbsp; <input type="text" name="hOBP7" />
        	<br /><br />
        	8번타자 : <input type="text" name="hWar8" />&nbsp;&nbsp; <input type="text" name="hSLG8" />&nbsp;&nbsp; <input type="text" name="hOBP8" />
        	<br /><br />
        	9번타자 : <input type="text" name="hWar9" />&nbsp;&nbsp; <input type="text" name="hSLG9" />&nbsp;&nbsp; <input type="text" name="hOBP9" />
        	<br /><br />
        	투수 : <input type="text" name="hWar10" />&nbsp;&nbsp; <input type="text" name="hERA1" />&nbsp;&nbsp; <input type="text" name="hWHIP1" />
        </div>
        <br /><br /><br /><br /><br /><br /><br />
        
        <div>
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
        <div style="margin-top:20px;"> 
        	1번타자 : <input type="text" name="aWar1" />&nbsp;&nbsp; <input type="text" name="aSLG1" />&nbsp;&nbsp; <input type="text" name="aOBP1" />
        	<br /><br />
        	2번타자 : <input type="text" name="aWar2" />&nbsp;&nbsp; <input type="text" name="aSLG2" />&nbsp;&nbsp; <input type="text" name="aOBP2" />
        	<br /><br />
        	3번타자 : <input type="text" name="aWar3" />&nbsp;&nbsp; <input type="text" name="aSLG3" />&nbsp;&nbsp; <input type="text" name="aOBP3" />
        	<br /><br />
        	4번타자 : <input type="text" name="aWar4" />&nbsp;&nbsp; <input type="text" name="aSLG4" />&nbsp;&nbsp; <input type="text" name="aOBP4" />
        	<br /><br />
        	5번타자 : <input type="text" name="aWar5" />&nbsp;&nbsp; <input type="text" name="aSLG5" />&nbsp;&nbsp; <input type="text" name="aOBP5" />
        	<br /><br />
        	6번타자 : <input type="text" name="aWar6" />&nbsp;&nbsp; <input type="text" name="aSLG6" />&nbsp;&nbsp; <input type="text" name="aOBP6" />
        	<br /><br />
        	7번타자 : <input type="text" name="aWar7" />&nbsp;&nbsp; <input type="text" name="aSLG7" />&nbsp;&nbsp; <input type="text" name="aOBP7" />
        	<br /><br />
        	8번타자 : <input type="text" name="aWar8" />&nbsp;&nbsp; <input type="text" name="aSLG8" />&nbsp;&nbsp; <input type="text" name="aOBP8" />
        	<br /><br />
        	9번타자 : <input type="text" name="aWar9" />&nbsp;&nbsp; <input type="text" name="aSLG9" />&nbsp;&nbsp; <input type="text" name="aOBP9" />
        	<br /><br />
        	투수 : <input type="text" name="aWar10" />&nbsp;&nbsp; <input type="text" name="aERA1" />&nbsp;&nbsp; <input type="text" name="aWHIP1" />
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