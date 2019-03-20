package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.model.User;
import com.user.service.UserService;

@Controller
public class LoginController {

	 @Autowired
	 UserService userservice;
	 
	  @RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
      public String init(Model model) {
      model.addAttribute("msg", "Please Enter Your Login Details");
      return "adminlogin.jsp";
         }
	 
	  
	@RequestMapping(value="/adminsubmit", method = RequestMethod.POST)
	//  public String showWelcomePage(@ModelAttribute("user") User user,ModelMap model,@RequestParam String username, @RequestParam String password){

	  public String showWelcomePage(@ModelAttribute("user") User user,ModelMap model){
           //  User user=null;
	        //boolean isValidUser = LoginController.validateUser(username, password);
		    
		    //boolean isValidUser = userservice.validateUser(username, password);
		    
		    boolean isValidUser = userservice.validateUser(user);
		    System.out.println("+=================="+isValidUser);
	        if (!isValidUser) {
		   // if(user.getUserrole()!="admin"){			
	            model.put("error", "Invalid Credentials");
	            return "adminlogin.jsp";
	        }

	        model.put("name", user.getUsername());
	        model.put("password", user.getPassword());

	        return "login.jsp";
	    }
	  	  
		 
		 @RequestMapping(value="/logout")
		 public String logout()
		 {
			 return "adminlogin.jsp";
		 }
		 
		 
		 @RequestMapping(value="/skip")
		 public String skip()
		 {
			 return "login.jsp";
		 }
	      
}
