package com.moses.Model;

import java.time.LocalDate;

public class Stock {

	private int sn;
	private String name;
	private Double Price;
	private String quantity;
	private LocalDate manufactureDate;
	private LocalDate expiryDate;
	
	public Stock() {
		super();
	}

	public Stock(int sn, String name, Double price, String quantity, LocalDate manufactureDate, LocalDate expiryDate) {
		super();
		this.sn = sn;
		this.name = name;
		Price = price;
		this.quantity = quantity;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
	}

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Stock [sn=" + sn + ", name=" + name + ", Price=" + Price + ", quantity=" + quantity
				+ ", manufactureDate=" + manufactureDate + ", expiryDate=" + expiryDate + "]";
	}
	
	
	
}
