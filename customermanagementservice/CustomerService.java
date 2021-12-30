package com.example.customermanagementservice.service;

import java.util.List;

import com.example.customermanagementservice.model.Customers;



public interface CustomerService {
	
	public List<Customers> getAllCustomers();
	public Customers addCustomer(Customers customer);
	public String deleteCustomer(Integer cid);
	public List<Trips> getAllTrips();
	
}