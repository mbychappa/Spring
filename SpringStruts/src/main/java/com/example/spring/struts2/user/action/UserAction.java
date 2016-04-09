package com.example.spring.struts2.user.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.example.spring.struts2.user.bo.UserBo;
import com.example.spring.struts2.user.bo.impl.UserBoImpl;
import com.opensymphony.xwork2.ActionSupport;
 
public class UserAction extends ActionSupport{

	UserBo userBo;
	
	public UserBo getUserBo() {
		return userBo;
	}

	public String execute() throws Exception {
		
		
		userBo = new UserBoImpl();
		userBo.setname("NonSpring");
		
		userBo.toString();

		return SUCCESS;
		
	}
}