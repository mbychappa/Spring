package com.example.spring.data.dao;

import java.util.List;

import com.example.spring.data.model.Customer;

public interface CustomerDAO 
{
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
	public List<Customer> findAllCustomers();
	public void delete(Customer customer);
	public void update(Customer customer);


}




