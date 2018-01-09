package com.deep.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deep.web.dao.User;
import com.deep.web.service.UsersService;

@Controller
public class LoginController {

	private	UsersService usersService;
	
	@Autowired
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}

	@RequestMapping("/newaccount")
	public String showAccount(Model model) {
		model.addAttribute("user", new User());
		return "newaccount";
	}

	@RequestMapping("/createaccount")
	public String createAccount(Model model,@Valid User user, BindingResult result) {
		System.out.println(user.getEmail()+" "+user.getUsername());
		System.out.println("account created");
		if(result.hasErrors()){
			return "newaccount";
		}
		user.setAuthority("user");
		user.setEnabled(false);
		
		usersService.create(user);
		return "accountcreated";
	}

}
