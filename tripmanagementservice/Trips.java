package com.example.tripmanagementservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trips")
public class Trips {
	
	@Id
	Integer trip_id;
	@Column
	Integer car_no;
	@Column
	String source
	@Column
	String destination
	@Column
	String date
	@Column
	String customer_name;
	@Column
	Integer amount;
	public Trips(Integer trip_id,Integer car_no,String source,String destination,String date,String customer_name,String amount ) {
		super();
		this.trip_id = trip_id;
		this.car_no=car_no;
		this.source=source;
		this.destination=destination;
		this.date=date;
		this.customer_name=customer_name;
		this.amount=amount;
	}
	public Integer getTrip_id() {
		return trip_id;
	}
	public void setTrip_id(Integer trip_id) {
		this.trip_id=trip_id
	}
	public Integer getCar_no() {
		return car_no;
	}
	public void setCar_no(Integer car_no) {
		this.car_no=car_no;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source=source;
	}	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination=destination;
	}

	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name){
		this.customer_name=customer_name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String Date) {
		this.date = date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount=amount;
	}

}