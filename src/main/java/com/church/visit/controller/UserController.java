package com.church.visit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.church.visit.model.User;
import com.church.visit.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public User create(HttpServletRequest request, User user) {
		
		userService.create(user);
		
		return null;
	}
	
	public User login(HttpServletRequest request, User user) {

		
		return null;
	}
}