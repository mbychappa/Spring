package com.example.spring.integration.service;

import org.apache.log4j.Logger;
import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;

import com.example.spring.integration.domain.Order;

/**
 * Splits an Order into it's constituent OrderItems
 *
 */
public class OrderSplitter extends AbstractMessageSplitter{

	private static final Logger log = Logger.getLogger(OrderSplitter.class);

	@Override
	protected Object splitMessage(Message<?> message) {
	
//		log.debug("*** [OrderSplitter] ****");

		log.info("*** [OrderSplitter] splitting Order into it's constituent OrderItems : number of OrderItems: "+ ((Order)message.getPayload()).getOrderItems().size() + " ****");

		return ((Order)message.getPayload()).getOrderItems();
	}

}
