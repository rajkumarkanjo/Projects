package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserRepository;
import com.user.model.User;

@Service
public class UserService {

	 @Autowired
	// AdminRepository adminrepository;
	 UserRepository userRepo;
	 
	 /*public boolean validateUser(String username, String password) {
	        return username.equalsIgnoreCase("rajkumarkanjo")
	                && password.equalsIgnoreCase("12345");
	    }*/
	 
	 public boolean validateUser(User user )
	 {
		boolean res=false;
		User usr=null;
		try {
			usr = userRepo.findByName(user.getUsername());
			System.out.println(usr);
			if(usr==null ){
				throw new Exception("User not found");
			}else{
				if(user.getPassword().equals(usr.getPassword()) && usr.getUserrole().equalsIgnoreCase("admin")){
					res=true;
					System.out.println("Suceefully loggedIn");
				}else{
					System.out.println("Invalid password");
				}
			}
		} catch (Exception e) {
			System.out.println("No record found");
			e.printStackTrace();
		}
 
		 return res;
		 
	 }
	  
}
