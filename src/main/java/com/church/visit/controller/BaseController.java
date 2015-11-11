package com.church.visit.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import com.church.visit.model.User;
import com.church.visit.utils.SessionUser;

public class BaseController {
	
	public final static String SESSION_KEY = "sessionuserkey";

	public Map<String, Object> ajaxResult(Boolean success, Object arg){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", success);
		map.put("data", arg);
		return map;
	}
	
	/**
	 * 初始化sessionUser
	 * @param user
	 * @return
	 */
	public SessionUser initSessionUser(User user) {

		if(user == null){
			return null;
		}
		SessionUser sessionUser = new SessionUser();
		sessionUser.setUid(user.getId());
		sessionUser.setGmtLogin(new Date());

		return sessionUser;
	}

	
	/**
	 * 获取当前登录用户uid
	 * @param request
	 * @return
	 */
	public Long getUid(HttpServletRequest request){
		return getSessionUser(request).getUid();
	}
	
	public SessionUser getSessionUser(HttpServletRequest request) {
		return (SessionUser) request.getSession().getAttribute(SESSION_KEY);
	}
	
	public void setSessionUser(HttpServletRequest request, SessionUser sessionUser){
		request.getSession().setAttribute(SESSION_KEY, sessionUser);
	}
	
	public void removeSession(HttpServletRequest request, String sessionKey) {
		request.getSession().removeAttribute(sessionKey);
	}
	
}
