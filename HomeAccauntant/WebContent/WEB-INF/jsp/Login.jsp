<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>HomeAccountant LOGIN</title>
	<link rel="stylesheet" href="css/loginpage.css">
</head>
<body>

	<header class="container">
		<div>
			<img src="img/logo.png" alt="logotipe" class="logo">
			<nav>
				<ul class="menu">
					<li><a class="link" href="#">Home</a></li>
					<li><a class="link" href="#">Spendings</a></li>
					<li><a class="link" href="#">About us</a></li>
				</ul>	
			</nav>
		</div>
	</header>

	<section class="container">
		<div class="login">
			<form action="Controller" method="post">
				<input type="hidden" name="comand" value="log_in"/>
				<table>
				<tr>
					<td><p>Login</p></td>
					<td><input type="text" name="login" value="" class="firstinput"/></td>
				</tr>
				<tr>
					<td><p>Password</p></td>
					<td><input type="password" name="password" value=""/></td>
				</tr>
				</table>
				
				<i class="error">
					<c:if test="${not empty requestScope.errorMsg}" >
						<c:out value="${requestScope.errorMsg}"/>
					</c:if></i>
					
				<input type="submit" value="sign in"/>	
			</form>
		</div>
	</section>
	
	<footer class="container">
		<div>
			<h2>Economy Group Corporation Inc.<br>
			2018. Developed by IT-academy</h2>
		
		</div>
	</footer>

</body>
</html>