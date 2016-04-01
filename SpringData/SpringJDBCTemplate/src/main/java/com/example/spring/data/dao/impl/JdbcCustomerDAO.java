package com.example.spring.data.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.spring.data.dao.CustomerDAO;
import com.example.spring.data.model.Customer;

public class JdbcCustomerDAO implements CustomerDAO
{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	    this.jdbcTemplateObject = new JdbcTemplate(dataSource);

	}
	
	public void insert(Customer customer){
		
		String sql = "INSERT INTO CUSTOMER " +
				"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		jdbcTemplateObject.update(sql,customer.getCustId(),customer.getName(),customer.getAge());
		System.out.println("Inserted record for:"+customer.getName());
	}
	
	public Customer findByCustomerId(int custId){
		
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
		
		Customer student = jdbcTemplateObject.queryForObject(sql, 
                new Object[]{custId}, new CustomerMapper());
		return student;
	}

	public List<Customer> findAllCustomers() {
		String sql = "SELECT * FROM CUSTOMER";
		
		List<Customer> customers = jdbcTemplateObject.query(sql,new CustomerMapper());
		return customers;
	}

	public void delete(int custId) {
		String sql = "DELETE from CUSTOMER where CUST_ID = ?";
	      jdbcTemplateObject.update(sql, custId);
	      System.out.println("Deleted Record with CUST_ID = " + custId );
	      return;
	}

	public void updateAge(int custId, int age) {
		String sql = "UPDATE CUSTOMER set AGE = ? where CUST_ID = ?";
	      jdbcTemplateObject.update(sql, age, custId);
	      System.out.println("Updated Record with CUST_ID = " + custId );
	      return;
	}
}




