<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>HomeAccountant REGISTRATION</title>
	<link rel="stylesheet" href="css/regpage.css">
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
		<div class="registrationform">
			<form action="Controller" method="post">
				<input type="hidden" name="comand" value="registration"/>
					<table>
						<tr>
							<td><p>Login <i class="info1">*</i></p></td>
							<td><input type="text" name="login" value="" class="firstinput"/></td>
						</tr>
						<tr>
							<td><p>Password <i class="info1">*</i></p></td>
							<td><input type="password" name="password" value=""/></td>
						</tr>
						<tr>
							<td><p>Name</p></td>
							<td><input type="text" name="name" value=""/></td>
						</tr>
						<tr>
							<td><p>Surname</p></td>
							<td><input type="text" name="surname" value=""/></td>
						</tr>
						<tr>
							<td><p>e-mail</p></td>
							<td><input type="text" name="email" value=""/></td>
						</tr>
					</table>
					<input type="submit" value="sign in"/>	
				</form>
				
				<p class="info">*- fealds are required</p>
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