package com.Demo.OrderManagementTask.EntityLayer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MenuItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double price;
	private Integer availableQuantity;
	private Category APPETIZER, MAIN_COURSE, DESSERT;
	public MenuItem(Long id, String name, Double price, Integer availableQuantity, Category aPPETIZER,
			Category mAIN_COURSE, Category dESSERT) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.availableQuantity = availableQuantity;
		APPETIZER = aPPETIZER;
		MAIN_COURSE = mAIN_COURSE;
		DESSERT = dESSERT;
	}
	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	public Category getAPPETIZER() {
		return APPETIZER;
	}
	public void setAPPETIZER(Category aPPETIZER) {
		APPETIZER = aPPETIZER;
	}
	public Category getMAIN_COURSE() {
		return MAIN_COURSE;
	}
	public void setMAIN_COURSE(Category mAIN_COURSE) {
		MAIN_COURSE = mAIN_COURSE;
	}
	public Category getDESSERT() {
		return DESSERT;
	}
	public void setDESSERT(Category dESSERT) {
		DESSERT = dESSERT;
	}
	
	

}
