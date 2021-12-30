package com.example.commentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customermanagementservice.model.Customers;
import com.example.customermanagementservice.service.CustomerService;


@RestController
@RequestMapping("/customerservice")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public List<Customers> getAll(){
		return service.getAllCustomers();
	}
		
	@PostMapping("/add")
	public Customers addCustomer(@RequestBody Customers customer) {
		return service.addCustomer(customer);
	}
	
	@DeleteMapping("/delete/{cid}")
	public String deleteCustomer(@PathVariable("cid") Integer cid) {
		return service.deleteCustomer(cid);
		
	}

	@GetMapping("/trip/all")
	public List<Trips> getAll(){
		return service.getAllTrips();
	}
	
	