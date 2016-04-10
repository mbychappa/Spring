package com.example.spring.integration.service;

import org.springframework.integration.annotation.Gateway;

import com.example.spring.integration.domain.Order;

/**
 * Gateway interface. Provides facade to clients of the process pipeline
 * Will place all Orders into the 'orders' channel
 * 
 */
public interface Shop {

	@Gateway(requestChannel="ordersChannel")
	void placeOrder(Order order);

}