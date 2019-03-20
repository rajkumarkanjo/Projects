package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.user.dao.UserRepository;
import com.user.model.User;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepo;

	@GetMapping("/")
	public static String delete() {
		return "delete.jsp";
	}

	/*
	 * Get Method to display login page
	 */
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "login.jsp";
	}

	/*
	 * POST Method to display login page
	 */
	@RequestMapping(value = "submit", method = RequestMethod.POST)
	public String submit(@ModelAttribute("user") User user, Model model) {
		System.out.println("************************");
		System.out.println("userdetails" + user);

		if (user.getUsername() == null) {
			model.addAttribute("error", "Please Enter Your Login Details");
			return "login.jsp";
		}

		userRepo.save(user);
		// return init1(model);
		model.addAttribute("msg", user.getUsername().toString());
		return "success.jsp";
	}

	/*
	 * GetByID Method to display logi page
	 */
	@RequestMapping(value = "getbyId", method = RequestMethod.GET)
	// @RequestMapping(value = "getbyId/{id}", method = RequestMethod.GET)
	public String getbyId(@RequestParam String id, Model model) {
		// ModelAndView mv = new ModelAndView("showuser.jsp");
		User user = userRepo.findOne(id);
		if (user == null) {
			model.addAttribute("errID", "Id does not exist");
			return "login.jsp";
		}
		model.addAttribute("user", user);
		// mv.addObject(user);
		return "showuser.jsp";
	}

	@RequestMapping(value = "getAll", method = RequestMethod.GET)
	public ModelAndView getAll(Model model) {
		ModelAndView mv = new ModelAndView("ShowALL.jsp");
		List<User> user = (List<User>) userRepo.findAll();
		System.out.println(user);
		model.addAttribute("user", user);
		mv.addObject(user);
		return mv;
	}

	@RequestMapping(value = "/delete")
	public String deleteUser(@RequestParam String id, Model model) {
		// User user = userRepo.findOne(id);
		// System.out.println("user " + id);
		// ModelAndView mv = new ModelAndView("success.jsp");
		// String status = "failure";
		User usr = userRepo.findOne(id);

		if (usr == null) {
			model.addAttribute("errdelete", "Id does not exist");
			return "login.jsp";
		}

		userRepo.delete(id);

		model.addAttribute("msg", "User    " + usr.getUsername()
				+ " deleted succesfully..!!!");

		return UserController.delete();

	}

	@RequestMapping(value = "/edituser/{id}")
	public String edit(@PathVariable String id, Model m) {
		User user = userRepo.findOne(id);
		m.addAttribute("command", user);
		return "edituser.jsp";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateuser(@ModelAttribute("user") User user, Model model) {
		User usr = null;
		try {
			usr = userRepo.findOne(user.getId());
			System.out.println("======================>" + usr);
			usr.setUsername(user.getUsername());
			usr.setPassword(user.getPassword());
			usr.setUserrole(user.getUserrole());
			userRepo.save(usr);

		} catch (Exception e) {

			e.printStackTrace();
		}
         
		model.addAttribute("msg", "User    " + usr.getUsername()
				+ " updated succesfully..!!!");
		return "success.jsp";

	}

}
