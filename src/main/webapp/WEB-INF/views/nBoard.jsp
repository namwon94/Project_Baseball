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
          <li class="breadcrumb-item active">NBA Board</li>
        </ol>
        <form action="${pageContext.request.contextPath }/nBoard_get.do"" method="get">
        <fieldset>
        <div>
        	Home Team : 
        	<select name="home_Team">
        		<option value="HOU">HOU</option>
        		<option value="POR">POR</option>
        		<option value="CHA">CHA</option>
        		<option value="ORL">ORL</option>
        		<option value="OKC">OKC</option>
        		<option value="BOS">BOS</option>
        		<option value="CHI">CHI</option>
        		<option value="DEN">DEN</option>
        		<option value="LAL">LAL</option>
        		<option value="BKN">BKN</option>
        		<option value="SAC">SAC</option>
        		<option value="PHX">PHX</option>
        		<option value="DAL">DAL</option>
        		<option value="CLE">CLE</option>
        		<option value="ATL">ATL</option>
        		<option value="IND">IND</option>
        		<option value="PHI">PHI</option>
        		<option value="DET">DET</option>
        		<option value="TOR">TOR</option>
        		<option value="MIA">MIA</option>
        		<option value="GS">GS</option>
        		<option value="MIL">MIL</option>
        		<option value="MIN">MIN</option>
        		<option value="SA">SA</option>
        		<option value="MEN">MEN</option>
        		<option value="UTAH">UTAH</option>
        		<option value="NO">NO</option>
        		<option value="LAC">LAC</option>
        		<option value="WSH">WSH</option>
        		<option value="NYK">NYK</option>
        	</select>
        </div>
        <div style="margin-top:10px;"> 
        	home_WS : <input type="text" name="home_WS" />
        	home_VORP : <input type="text" name="home_VORP" />
        	home_BPM : <input type="text" name="home_BPM" />
        </div>
        </fieldset>
        <br />
        
        <div>
        	Away Team : 
        	<select name="away_Team">
        		<option value="HOU">HOU</option>
        		<option value="POR">POR</option>
        		<option value="CHA">CHA</option>
        		<option value="ORL">ORL</option>
        		<option value="OKC">OKC</option>
        		<option value="BOS">BOS</option>
        		<option value="CHI">CHI</option>
        		<option value="DEN">DEN</option>
        		<option value="LAL">LAL</option>
        		<option value="BKN">BKN</option>
        		<option value="SAC">SAC</option>
        		<option value="PHX">PHX</option>
        		<option value="DAL">DAL</option>
        		<option value="CLE">CLE</option>
        		<option value="ATL">ATL</option>
        		<option value="IND">IND</option>
        		<option value="PHI">PHI</option>
        		<option value="DET">DET</option>
        		<option value="TOR">TOR</option>
        		<option value="MIA">MIA</option>
        		<option value="GS">GS</option>
        		<option value="MIL">MIL</option>
        		<option value="MIN">MIN</option>
        		<option value="SA">SA</option>
        		<option value="MEN">MEN</option>
        		<option value="UTAH">UTAH</option>
        		<option value="NO">NO</option>
        		<option value="LAC">LAC</option>
        		<option value="WSH">WSH</option>
        		<option value="NYK">NYK</option>
        	</select>
        </div>
        <div style="margin-top:10px;"> 
        	away_WS : <input type="text" name="away_WS" />
        	away_VORP : <input type="text" name="away_VORP" />
        	away_BPM : <input type="text" name="away_BPM" />
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