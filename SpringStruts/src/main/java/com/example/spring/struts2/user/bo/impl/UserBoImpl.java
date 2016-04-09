package com.example.spring.struts2.user.bo.impl;

import com.example.spring.struts2.user.bo.UserBo;

public class UserBoImpl implements UserBo{

	private String name;
	
	@Override
	public String toString() {
		if (name.isEmpty())
		return "DefaultName";
		else
			return name;
	}


	public void setname(String name) {
		this.name=name;
		
	}


	public String getname() {
		return name;
	}

}