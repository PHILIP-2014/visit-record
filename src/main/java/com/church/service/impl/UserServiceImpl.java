package com.church.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.church.dao.UserDao;
import com.church.model.User;
import com.church.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User create(User user) {
		userDao.insert(init(user));
		return user;
	}

	private User init(User user) {
		user.setIsDisable(false);
		return user;
	}
}
