package com.example.spring.data.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.spring.data.model.Customer;

public class CustomerMapper implements RowMapper<Customer> {
	   public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		   Customer customer = new Customer();
		   customer.setCustId(rs.getInt("CUST_ID"));
		   customer.setName(rs.getString("NAME"));
		   customer.setAge(rs.getInt("AGE"));
		      return customer;
		   }
}
