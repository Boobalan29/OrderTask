package com.Demo.OrderManagementTask.EntityLayer;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name="Ordertable")
public class Order {
	
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
	    private List<OrderItem> items;
	    @Positive
	    private Double totalAmount;
	    private Status RECEIVED, PREPARING, READY, DELIVERED;
	    @NotNull
	    private String customerName;
	    @NotNull
	    private String customerPhone;
	    private LocalDateTime createdAt;
		public Order() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Order(Long id, List<OrderItem> items, @Positive Double totalAmount, Status rECEIVED, Status pREPARING,
				Status rEADY, Status dELIVERED, @NotNull String customerName, @NotNull String customerPhone,
				LocalDateTime createdAt) {
			super();
			this.id = id;
			this.items = items;
			this.totalAmount = totalAmount;
			RECEIVED = rECEIVED;
			PREPARING = pREPARING;
			READY = rEADY;
			DELIVERED = dELIVERED;
			this.customerName = customerName;
			this.customerPhone = customerPhone;
			this.createdAt = createdAt;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public List<OrderItem> getItems() {
			return items;
		}
		public void setItems(List<OrderItem> items) {
			this.items = items;
		}
		public Double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(Double totalAmount) {
			this.totalAmount = totalAmount;
		}
		public Status getRECEIVED() {
			return RECEIVED;
		}
		public void setRECEIVED(Status rECEIVED) {
			RECEIVED = rECEIVED;
		}
		public Status getPREPARING() {
			return PREPARING;
		}
		public void setPREPARING(Status pREPARING) {
			PREPARING = pREPARING;
		}
		public Status getREADY() {
			return READY;
		}
		public void setREADY(Status rEADY) {
			READY = rEADY;
		}
		public Status getDELIVERED() {
			return DELIVERED;
		}
		public void setDELIVERED(Status dELIVERED) {
			DELIVERED = dELIVERED;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerPhone() {
			return customerPhone;
		}
		public void setCustomerPhone(String customerPhone) {
			this.customerPhone = customerPhone;
		}
		public LocalDateTime getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}
	    
}
