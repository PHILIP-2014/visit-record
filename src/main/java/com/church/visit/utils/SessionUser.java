package com.church.visit.utils;

import java.io.Serializable;
import java.util.Date;

public class SessionUser implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long uid;		//用户唯一标识
	private String mobile;	//手机号
	private String email;	//邮箱
	private Long cid;		//公司id
	private Date gmtLogin;	//登录时间

	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Date getGmtLogin() {
		return gmtLogin;
	}
	public void setGmtLogin(Date gmtLogin) {
		this.gmtLogin = gmtLogin;
	}
}