package org.employee.model;

import java.sql.Date;

public class UserInfo {

	 String userId;
	 String password;
	 String loginTime;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public UserInfo(String userId, String password, String loginTime) {
		super();
		this.userId = userId;
		this.password = password;
		this.loginTime = loginTime;
	}
	
	
	
}
