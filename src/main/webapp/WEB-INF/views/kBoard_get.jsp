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

<title>MLB 승률 예측</title>

  <!-- Custom fonts for this template-->
  <link href="res/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Page level plugin CSS-->
  <link href="res/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="res/css/sb-admin.css" rel="stylesheet">

</head>
<body id="page-top">
<!--  받은 파라미터 표시(HOME&AWAY )  -->
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
      </li>
    </ul>
    
   
    <div id="content-wrapper">     

     <div class="container-fluid">
     
     	<!-- Breadcrumbs-->
        <ol class="breadcrumb">
          <li class="breadcrumb-item active">KBO Board</li>
        </ol>
		<div class="row">
	         <div class="col-xl-3 col-sm-6 mb-3">
	           <div class="card text-white bg-primary o-hidden h-100">
	             <div class="card-body">
	               <div class="card-body-icon">
	                 <i class="fas fa-fw fa-comments"></i>
	               </div>
	               <div class="mr-5">${win_Team }팀 승리</div>
	             </div>		
				</div>
			</div>
		</div>
		
		<div>
			<img src="./res/KBO.jpg" alt="KBO" width="300px", heigtht="300px" />
			<br /><br /><br />
			<img src="./res/KBOTEAM.jpg" alt="KBOTEAM" />
		</div>

	
 
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
