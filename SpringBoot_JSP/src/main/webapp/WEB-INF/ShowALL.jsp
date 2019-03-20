<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
html {
	background: url(http://getwallpapers.com/wallpaper/full/5/e/b/9133.jpg) no-repeat
		center fixed;
	background-size: cover;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Users</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<!-- <body style="background-color: powderblue;">
 -->
 <body>
<!-- <h2>All Users Record</h2> -->
  <font color="green" align="center"><h4>ALL USERS</h4></font>
	 <table class="table" align="center" border="1">	
                <thead>
                  <tr color="red">
                     <th>ID</th> <th>User Name</th> <th>Password</th> <th>User Role</th> 
                  </tr>
                </thead>
                <tbody>
                    <c:forEach var="usr" items="${user}">
                      <tr>
                        <td>${usr.id}</td><td>${usr.username}</td><td>${usr.password}</td><td>${usr.userrole}</td>
                      </tr>
                    </c:forEach>
                </tbody>
              </table>
          <font align="center"> <p> <a href="/login "> <h4> HOMEPAGE </h4></a></p>  </font>
</body>
</html>