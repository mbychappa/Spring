package com.example.spring.struts2.user.action;

import com.example.spring.struts2.user.bo.UserBo;

public class UserSpringAction{

	//DI via Spring
	UserBo userBo;
	
	public UserBo getUserBo() {
		return userBo;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String execute() throws Exception {
		
		userBo.toString();
		
		return "success";
		
	}
}