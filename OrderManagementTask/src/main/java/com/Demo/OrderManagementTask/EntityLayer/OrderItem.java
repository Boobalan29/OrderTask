package com.Demo.OrderManagementTask.EntityLayer;

import jakarta.persistence.Entity;

@Entity
public class OrderItem {
	
	
		private MenuItem menuItem;
	    private Integer quantity;
	    private Double subtotal;

}
