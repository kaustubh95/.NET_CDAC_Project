package com.app.pojos;

import java.util.Date;

public class Product {
	private Integer id;
	private String name;
	private Date expDate;
	private double price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(Integer id, String name, Date expDate, double price) {
		super();
		this.id = id;
		this.name = name;
		this.expDate = expDate;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
