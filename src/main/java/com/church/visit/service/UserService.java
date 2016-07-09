package com.church.visit.service;

import com.church.visit.dao.UserDao;
import com.church.visit.model.User;
import com.church.visit.utils.PwdEncoder;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author philip
 *
 */
@Component("userService")
public class UserService {

	final static Logger logger = Logger.getLogger(UserService.class);
	
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
			logger.info("sorry, user not found");
			throw new IllegalArgumentException("sorry, user not found");
		}
		if(_user.getIsDisable()) {
			logger.info("sorry, user forbidden");
			throw new IllegalArgumentException("sorry, user forbidden");
		}
		if(!pwdEncoder.isPasswordValid(user.getPwd(), _user.getPwd())) {
			logger.info("sorry, pwd forbidden");
			throw new IllegalArgumentException("sorry, pwd forbidden");
		}
		return hideUser(_user);
	}

	private User hideUser(User user) {
		user.setPwd(null);
		user.setGmtCreate(null);
		user.setGmtModify(null);
		user.setIsDisable(null);
		logger.info(String.format("Hiding user : id = ", user.getId()));
		return user;
	}
	
}
