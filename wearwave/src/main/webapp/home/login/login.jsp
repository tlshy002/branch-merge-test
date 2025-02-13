<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
<link rel="stylesheet" type="text/css" href="../css/login.css">
</head>
<body>
<div class="wrapper" >
	<div class="wrap">
		<a href="/home/index.html" class="logo">
            <img alt="로고" src="../imgs/icon/logo.png" width="200" height="50">
        </a> 
		<div class="login_wrap"> 
			<div class="id_wrap">
					<div class="id_input_box">
					<input class="id_input" placeholder="아이디를 입력하세요">
				</div>
			</div>
			<div class="pw_wrap">
				<div class="pw_input_box">
					<input class="pw_input" placeholder="비밀번호를 입력하세요">
				</div>
			</div>
			<div class="login_button_wrap">
				<input type="button" class="login_button" value="로그인">
			</div>
			<div class="links_wrapper">
			    <a href="/login/findid.html" class="sub">아이디 찾기</a>
			    <span class="separator">●</span>
			    <a href="/login/findpwd.html" class="sub">비밀번호 찾기</a>
			    <span class="separator">●</span>
			    <a href="/login/selectentry.html" class="sub">회원가입</a>
			</div>
		</div>			
	</div>
	</div>
</body>
</html>
