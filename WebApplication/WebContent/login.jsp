<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/WebApplication/LoginServlet" method="POST">
				<br><br><h1><center>Login</center></h1>
				<table style="with: 50%" align="center"><br>			    
					<tr>
						<td>UserName</td>
						<td><input type="text" id="uname" name="uname" placeholder="username" /></td>
					</tr>
					<tr> 
						<td><td><div id="uname"></div></td></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" id="pswd" name="pswd" placeholder="password"/></td>
					</tr>	
					<tr> 
						<td><td><div id="pswd"></div></td></td>
					</tr>				
				</table><br>
		  <center><input type="submit" name="register" value="LOGIN" /></center>
		  			
		  </center>
	</form>


</body>
</html>