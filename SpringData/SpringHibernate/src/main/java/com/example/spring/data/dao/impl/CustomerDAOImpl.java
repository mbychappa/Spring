package com.example.spring.data.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring.data.dao.CustomerDAO;
import com.example.spring.data.model.Customer;

public class CustomerDAOImpl extends HibernateDaoSupport implements CustomerDAO
{
	@Transactional
	public void insert(Customer customer){
		
		getHibernateTemplate().save(customer);
		System.out.println("Inserted record for:"+customer.getName());
	}
	
	public Customer findByCustomerId(int custId){
		
		List customers = getHibernateTemplate().find("from Customer where CUST_ID=?",custId);
		
		return (Customer) customers.get(0);
	}

	public List<Customer> findAllCustomers() {
		List customers = getHibernateTemplate().find("from Customer");
		
		return customers;
	}

	@Transactional
	public void delete(Customer customer) {
		getHibernateTemplate().delete(customer);
		System.out.println("Deleted record for:"+customer.getName());


	}

	@Transactional
	public void update(Customer customer) {
		getHibernateTemplate().update(customer);
		System.out.println("Updated record for:"+customer.getName());


	}
}




