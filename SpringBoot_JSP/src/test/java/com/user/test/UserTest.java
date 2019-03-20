/*package com.user.test;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.user.Application;
import com.user.controller.UserController;
import com.user.model.Admin;
import com.user.model.User;
import com.user.service.UserService;




@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes =  Application.class)
public class UserTest {

	
	@Autowired
	UserController userController;
	
	@Autowired
	UserService userservice;
	
	
	  @Test
	   public void testGetById()
	   {
		  // User user = userController.getbyId("2");
		   //assertNotNull(user);
	   }
	  
	  @Test
	   public void testDeleteStudent()
	   {
		   userController.deleteUser("8", null);
		   assertTrue(true);
	   }
	  
	  @Test
	  public void admintest()
	  {
	    User user = null;
		//boolean status= userservice.validateUser(user, "rajkumarkanjo", "12345"); 
		//assertNotNull(status);
	  }
	  
}
*/