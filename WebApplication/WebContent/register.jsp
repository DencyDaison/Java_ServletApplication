<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="">
<form action="/WebApplication/RegisterServlet" method="POST">
				<br><br><h1><center>Registration</center></h1>
				<table style="with: 50%" align="center"><br>			    
					<tr>
						<td>Name</td>
						<td><input type="text" id="name" name="name" placeholder="enter name" onblur="namecheck()"/></td>
					</tr>
					<tr> 
						<td><td><div id="name"></div></td></td>
					</tr>	
					<tr>
						<td>Address</td>
						<td><input type="text" id="address" name="address" placeholder="enter address" onblur="addresscheck()"/></td>
					</tr>
					<tr> 
						<td><td><div id="address"></div></td></td>
					</tr>				
					<tr>
						<td>Email</td>
						<td><input type="text" id="email" name="email" placeholder="enter email" onblur="emailcheck()"/></td>
					</tr>
					<tr> 
						<td><td><div id="email"></div></td></td>
					</tr>
					<tr>
						<td>Mobile No</td>
						<td><input type="text" id="mobno" name="mobno" placeholder="mobile number" onblur="mobcheck()"/></td>
					</tr>
					<tr> 
						<td><td><div id="mobno"></div></td></td>
					</tr>
					<tr>
						<td>UserName</td>
						<td><input type="text" id="uname" name="uname" placeholder="username" onblur="usernamecheck()"/></td>
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
		  <center><input type="submit" name="register" value="REGISTER" /></center>
		  
		  			
		  </center>
	</form>

</body>
</html>