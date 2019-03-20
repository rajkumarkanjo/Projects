<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style >

html {
	background: url(http://getwallpapers.com/wallpaper/full/5/e/b/9133.jpg) no-repeat
		center fixed;
	background-size: cover;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>get the user details</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body >

<font color="green" align="center"><h4>USER DETAILS</h4></font>
	 <table class="table" align="center" border="1">	
	  <form action="edituser" method="POST">
                <thead>
                  <tr color="blue">
                     <th>ID</th> <th>UserName</th> <th>Password</th> <th>User Role</th> <th>Edit User</th> 
                  </tr> 
                </thead>
                <tbody>                  
                      <tr>
                        <td>${user.id}</td><td>${user.username}</td><td>${user.password}</td><td>${user.userrole}</td>
                        <td><a href="edituser/${user.id}">Edit</a></td>  
                      </tr>
                
                </tbody>
                </form>
              </table>
           <font align="center"> <p> <a href="/login "> <h4> HOMEPAGE </h4></a></p>  </font>  


</body>
</html>