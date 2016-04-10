package com.example.spring.integration.service;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.integration.router.AbstractMessageRouter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import com.example.spring.integration.domain.Book;
import com.example.spring.integration.domain.MusicCD;
import com.example.spring.integration.domain.OrderItem;
import com.example.spring.integration.domain.Software;

/**
 * Performs routing based on item type.
 * Will redirect 
 * 				to bookItemsChannel if the item is of type book
 * 				to musicItemsChannel if the item is of type musicCD
 * 				to softwareItemsChannel if the item is of type software
 * 
 *
 */
public class OrderItemRouter {

	private static final Logger log = Logger.getLogger(OrderItemRouter.class);

	public String routeOrder(OrderItem orderItem) {
		
		log.info("*** [OrderItemRouter] ****");

		String channel = "";
		if(isBook(orderItem)) {
			channel = "bookItemsChannel";
		}
		else if(isMusic(orderItem)) {
			channel = "musicItemsChannel";
		}
		else if(isSoftware(orderItem)) {
			channel = "softwareItemsChannel";
		}

		log.info("*** [OrderItemRouter] sending item : " + orderItem.getItem().getTitle() + " to "+ channel +  " ****");

		return channel;
   }
	
	private Boolean isBook(OrderItem orderItem) {
		return orderItem.getItem() instanceof Book;			
	}
	private Boolean isMusic(OrderItem orderItem) {
		return orderItem.getItem() instanceof MusicCD;			
	}
	private Boolean isSoftware(OrderItem orderItem) {
		return orderItem.getItem() instanceof Software;			
	}

	
}
