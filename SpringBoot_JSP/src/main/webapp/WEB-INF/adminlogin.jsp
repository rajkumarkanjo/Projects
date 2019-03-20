<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
img {
  max-width: 100%;
  height: auto;
}
html {
	background: url(http://getwallpapers.com/wallpaper/full/5/e/b/9133.jpg) no-repeat
		center fixed;
	background-size: cover;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
</head>
<!-- <body style="background-color: powderblue;"> -->
<body >
<!-- <img src="http://www.w3schools.com/css/rock600x400.jpg" alt="Cinque Terre" width="100" height="300"> -->
	<!--  <h3 color="green" style="background-color:DodgerBlue;" align="center">Admin Login Page</h3> -->
<!-- <body style="background-color: powderblue;"> -->

	<font color="blue" align="centre"><h3>${errorMessage}</h3></font>
	<font color="green" align="center"><h3>Admin Login Page</h3></font>
	<form action="adminsubmit" method="POST">

		<div align="center">
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username" required /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value=" Login " /></td>
				</tr>
			</table> <br>
		
			<div style="color: red"><h4>${error}</h4></div>
		</div>
	</form>
		  
</body>
								


</html>