package com.church.visit.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * User
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class User extends Base {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**姓名*/
	private String name;
	/**联系方式*/
	private String phone;
	/**密码*/
	private String pwd;
	/**年龄*/
	private Integer age;
	/**住址*/
	private String addr;
	/**类型: 
	 0:同工 
	 1:朋友男, 2:朋友女 
	 3:弟兄, 4:姊妹 
	 5:男孩, 6:女孩*/
	private Integer type;
	/**0:正常;1:删除*/
	private Boolean isDisable;

	public User(){
	}

	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return this.phone;
	}
	public void setPwd(String value) {
		this.pwd = value;
	}
	
	public String getPwd() {
		return this.pwd;
	}
	public void setAge(Integer value) {
		this.age = value;
	}
	
	public Integer getAge() {
		return this.age;
	}
	public void setAddr(String value) {
		this.addr = value;
	}
	
	public String getAddr() {
		return this.addr;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setIsDisable(Boolean value) {
		this.isDisable = value;
	}
	
	public Boolean getIsDisable() {
		return this.isDisable;
	}

}

