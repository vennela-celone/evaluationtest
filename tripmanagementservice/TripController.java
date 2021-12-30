package com.example.tripservice.controller;

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

import com.example.tripmanagementservice.model.Trips;
import com.example.tripmanagementservice.service.TripService;


@RestController
@RequestMapping("/tripmanagementservice")
public class CustomerController {
	
	@Autowired
	TripService service;
	
	@PostMapping("/add")
	public Trips addTrip(@RequestBody Trips trip) {
		return service.addTrip(trip);
	}
	
	@DeleteMapping("/delete/{trip_id}")
	public String deleteTrip(@PathVariable("trip_id") Integer trip_id) {
		return service.deleteTrip(trip_id);
	
		
	}
	@GetMapping("/search/{car_no}")
	public List<Trips> searchTripsByCar_no(@PathVariable("car_no")String car_no){
		return service.searchTripsByCar_no(car_no);
		
	}
	@GetMapping("/search/{customer_name}")
	public List<Trips> searchTripsByPassenger(@PathVariable("customer_name")String customer_name){
		return service.searchTripsByPassenger(customer_name);
		
	}



	
	}