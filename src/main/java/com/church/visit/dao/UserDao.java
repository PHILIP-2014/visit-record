package com.church.visit.dao;

import com.church.visit.model.User;

public interface UserDao {

	public Long insert(User user);
	
	public User queryByName(String name);
}
