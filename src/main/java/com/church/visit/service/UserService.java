package com.church.visit.service;

import com.church.visit.dao.UserDao;
import com.church.visit.model.User;
import com.church.visit.utils.PwdEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author philip
 *
 */
@Component("userService")
public class UserService {
	
	@Resource
	private UserDao userDao;
	@Resource
	private PwdEncoder pwdEncoder;
	
	/**
	 * 管理员创建新用户
	 * 需要校验管理权限
	 * @param user
	 * @param uid
	 * @return
	 */
	public User create(User user, Long uid) {
		
		//check uid permission
		
		userDao.insert(init(user));
		return user;
	}

	private User init(User user) {
		user.setIsDisable(false);
		return user;
	}
	
	/**
	 * 用户登陆
	 * @param user
	 * @return
	 */
	public User doLogin(User user) {

		User _user = userDao.queryByName(user.getName());
		if(_user == null) {
			
		}
		if(_user.getIsDisable()) {
			
		}
		if(!pwdEncoder.isPasswordValid(_user.getPwd(), _user.getPwd())) {
			
		}
		return user;
	}
	
}
