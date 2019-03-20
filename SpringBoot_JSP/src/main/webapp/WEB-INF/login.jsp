
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.button {
	background-color: #4CAF50;
	border: none;
	color: white;
	padding: 10px 24px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
	margin-left: 45px !important;
}

html {
	background: url(http://getwallpapers.com/wallpaper/full/5/e/b/9133.jpg) no-repeat
		center fixed;
	background-size: cover;
}

.button1 {
	width: 60px;
	text-align: center;
	margin: 0 auto;
	margin-left: 45px !important;
}

.button2 {
	width: 100px;
	text-align: center;
	margin: 0 auto;
	margin-left: 45px !important;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SPRING MVC</title>
</head>
<!-- <body style="background-color: powderblue;"> -->
<body>
   <!-------------------- Post Method to save an User -------------------------------->
   
	<font color="green" align="center"><h4>SAVE USER</h4></font>
	<form action="submit" method="POST">

		<div align="center">
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username" placeholder="Username"
						required /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"
						placeholder="Password"
						pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
						title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
						required /></td>
				</tr>

				<tr>
					<td>User Role</td>
					<td><select id="userrole" name="userrole">
							<option value="user">USER</option>
							<option value="admin">ADMIN</option>
							<option value="none">None</option>
					</select><br></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit" / class="button1"></td>
				</tr>

			</table>
			<div style="color: red">${error}</div>
		 </div>

	</form>

  <!-------------------- Post Method to save an User -------------------------------->
  
  <!-------------------- TO GET AN USER BY ID --------------------------------------->
	<font color="green" align="center"><h4>TO GET AN USER BY ID</h4></font>
	<form action="getbyId" method="GET">

		<div align="center">
			<table>

				<tr>
					<td>User ID</td>
					<td><input type="text" name="id" title="provide a Valid ID" required /></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Show" class="button1" /></td>
				</tr>
			</table>
			<div style="color: red">${errID}</div>
		</div>
	</form>

 <!------------------------ TO GET AN USER BY ID --------------------------------------->
 
  <!-------------------- TO DELETE AN USER BY ID --------------------------------------->

	<font color="green" align="center"><h4>TO DELETE AN USER BY ID</h4></font>

	<form action="/delete" method="DELETE">

		<div align="center">
			<table>
				<tr>
					<td>User ID</td>
					<td><input type="text" name="id" title="provide a Valid ID" required /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Delete" class="button1" /></td>
				</tr>
			</table>
			<div style="color: red">${errdelete}</div>
		</div>
	</form>
   <!-------------------- TO DELETE AN USER BY ID --------------------------------------->
   
     <!-------------------- Show All Users --------------------------------------->

	<font color="lightgreen" align="center"><h4 width: 1400px; style="width: 1402px;">Show All Users</h4></font>

	<form action="getAll" method="GET">

		<div align="center">
			<table>
				<tr>
					<td></td>
					<td><input type="submit" value="ShowAllUsers" class="button2" /></td>
				</tr>
			</table>
		</div>
	</form>
	
	 <!-------------------- Show All Users --------------------------------------->

   <!-------------------- Logout ---------------------------------------> 
	<form action="logout" method="POST">

		<div align="center">
			<table>
				<tr>
					<br></br>
					<td><input type="submit" class="button" value="LOGOUT"></td>
					<!-- 	<td><input type="submit" value="LOGOUT" /></td> -->
				</tr>
			</table>
		</div>
	</form>
<!-------------------- Logout ---------------------------------------> 
	
</body>
</html>