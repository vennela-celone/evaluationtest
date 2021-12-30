package com.example.customermanagementservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	
	@Id
	Integer cid;
	@Column
	String customer_name;
	@Column
	String address;
	@Column
	Integer mobileno;
	public Customers(Integer cid, String customer_name,String address,Integer mobileno) {
		super();
		this.cid = cid;
		this.customer_name=customer_name;
		this.address=address;
		this.mobileno=mobileno;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name){
		this.customer_name=customer_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getMobileno() {
		return mobileno;
	}
	public void setMobileno(Integer Mobileno) {
		this.mobileno=mobileno;
	}
	

}