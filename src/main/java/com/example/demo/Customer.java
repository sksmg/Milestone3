package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer {	
	@Id
	int customer_id;
	String customer_name;
	String address;	
	public Customer() {		
	}
	public Customer(int customer_id, String customer_name, String city, long pincode, int numoforders) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.address = address;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddressy(String city) {
		this.address = address;
	}
}
