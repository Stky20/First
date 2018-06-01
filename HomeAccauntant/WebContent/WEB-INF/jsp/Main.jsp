<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home Accountant Welcome Page</title>
	<link rel="stylesheet" href="css/main1.css">
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
		<div>
			<h1 >Welcome to the app <br> "Home accountant"</h1>
			
			<table>
					<tr>
						<td>			
							<form action="Controller" method="get">
								<input type="hidden" name="comand" value="login_page"/>
								<input type="submit" name="login" value="Login" class="button"/>
							</form>
						</td>
						<td>							
							<form action="Controller" method="get">
								<input type="hidden" name="comand" value="registration_page"/>
								<input type="submit" name="registration" value="Registration" class="button"/>
							</form>
						</td>
					<tr>
			</table>
			
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