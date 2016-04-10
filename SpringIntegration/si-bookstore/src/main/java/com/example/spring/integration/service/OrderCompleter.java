package com.example.spring.integration.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.example.spring.integration.domain.Order;
import com.example.spring.integration.domain.OrderItem;

/**
 * Receives the collection of order items that have been processed
 * for the discount reduction.
 * 
 *
 */
public class OrderCompleter {
	
	private static final Logger log = Logger.getLogger(OrderCompleter.class);

	public Order prepareDelivery(List<OrderItem> orderItems) {
		final Order order = new Order();
		order.setOrderItems(orderItems);
		
//		log.debug("*** [OrderCompleter] CompletedOrder : "
//		+ order +" ****");

		log.info("*** [OrderCompleter] CompletedOrder Discounted cost: "
		+ order.getTotalDiscountedCost() +" ****");

		return order;
	}
}
