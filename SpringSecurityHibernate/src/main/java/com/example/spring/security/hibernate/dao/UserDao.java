package com.example.spring.security.hibernate.dao;

import com.example.spring.security.hibernate.model.User;

public interface UserDao {

	User findByUserName(String username);

}