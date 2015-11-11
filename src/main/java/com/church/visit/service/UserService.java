package com.church.visit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.church.visit.dao.UserDao;
import com.church.visit.model.User;
import com.church.visit.utils.PwdEncoder;

@Service("userService")
public class UserService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private PwdEncoder pwdEncoder;
	
	public User create(User user) {
		userDao.insert(init(user));
		return user;
	}

	private User init(User user) {
		user.setIsDisable(false);
		return user;
	}
	
	public User doLogin(User user) {

		User _user = userDao.queryByName(user.getName());
		if(_user == null) {
			
		}
		if(_user.getIsDisable()) {
			
		}
		if(!pwdEncoder.isPasswordValid(_user.getPassword(), _user.getPassword())) {
			
		}
		return user;
	}
	
}
