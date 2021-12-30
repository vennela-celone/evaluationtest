package com.example.tripmanagementservice.service;

import java.util.List;

import com.example.tripmanagementservice.model.Trips;



public interface TripService {

	public Trips addTrip(Trips trip);
	public String deleteCustomer(Integer trip_id);
	public List<Trips> searchTripsByCar_no(Integer car_no);
	public List<Trips> searchTripsByPassenger(String customer_name);
	
	
}