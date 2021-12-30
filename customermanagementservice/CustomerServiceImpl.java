package com.example.customermanagementservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customermanagementservice.model.Customers;
import com.example.customermanagamentservice.repo.CustomersRepo;



@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomersRepo repo;

	@Override
	public List<Customers> getAllCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Customers addCustomer(Customers customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public String deleteCustomer(Integer cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "Customer Deleted";
	}
	@Override
	public List<Trips> getAllTrips(){
	// TODO Auto-generated method stub
		return repo.findAll();
	}


	

}