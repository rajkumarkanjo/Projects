<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
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
<title>Insert title here</title>
</head>
<!-- <body style="background-color: powderblue;"> -->
<body>
 <font color="green" align="center"><h2>EDIT USER</h2></font>
       <form:form method="POST" action="/update">    
       <div align="center">
        <table >   
         <tr>    
          <td>User Id : </td>   
          <td><form:input path="id"  /></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="username"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="password" /></td>  
         </tr>   
         <tr>    
          <td>User Role :</td>    
          <td>
                    <select <form:input path="userrole" />>
							<option value="user">USER</option>
							<option value="admin">ADMIN</option>
							<option value="none">None</option>
					</select>
           </td>  
         </tr>   
           
         <tr>    	
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>   
        </div> 
       </form:form>   
       
      <font align="center"> <p> <a href="/login "> <h4> HOMEPAGE </h4></a></p>  </font>  
</body>
</html>