package com.example.spring.data.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring.data.dao.CustomerDAO;
import com.example.spring.data.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO
{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void insert(Customer customer){
		
		entityManager.persist(customer);
		System.out.println("Inserted record for:"+customer.getName());
	}
	
	public Customer findByCustomerId(int custId){
		
		Customer customer=entityManager.find(Customer.class, custId);
		return customer;
	}

	public List<Customer> findAllCustomers() {
		
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
	    CriteriaQuery<Customer> cq = builder.createQuery(Customer.class);
	    Root<Customer> root = cq.from(Customer.class);
	    cq.select(root);
	    return entityManager.createQuery(cq).getResultList();
	}

	@Transactional
	public void delete(Customer customer) {
		Customer cust=entityManager.find(Customer.class, customer.getCustId());

		entityManager.remove(cust);
		System.out.println("Deleted record for:"+customer.getName());
	}

	@Transactional
	public void update(Customer customer) {
		entityManager.merge(customer);
		System.out.println("Updated record for:"+customer.getName());


	}
}




