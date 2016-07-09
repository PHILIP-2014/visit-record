package com.church.visit.controller;

import com.church.visit.exception.ServiceException;
import com.church.visit.model.User;
import com.church.visit.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	final static Logger logger = Logger.getLogger(UserController.class);
	
	@Resource
	private UserService userService;

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		
		return null;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public User login(HttpServletRequest request, HttpServletResponse response, User user) {

		User _user = null;
		try {
			_user = userService.doLogin(user);
		} catch (ServiceException e) {
			logger.error(e.getMessage());
			sendError(request, response, e.getMessage());
		}
//		setSessionUser(request, initSessionUser(_user));
		
		return _user;
	}

	@RequestMapping(value="/create", method=RequestMethod.POST)
	@ResponseBody
	public User create(HttpServletRequest request, User user) {
		
		return userService.create(user, getUid(request));
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		removeSession(request, SESSION_KEY);
		return "redirect:/login.htm"; //FIXME
	}
	
}
