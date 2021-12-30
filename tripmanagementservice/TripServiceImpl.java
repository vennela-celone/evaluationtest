package com.example.tripmanagementservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tripmanagementservice.model.Trips;
import com.example.tripmanagamentservice.repo.TripsRepo;



@Service
public class TripServiceImpl implements TripService{
	
	@Autowired
	TripsRepo repo;



	@Override
	public Trips addTrip(Trips trip) {
		// TODO Auto-generated method stub
		return repo.save(trip);
	}

	@Override
	public String deleteTrip(Integer trip_id) {
		// TODO Auto-generated method stub
		repo.deleteById(trip_id);
		return "Trip Deleted";
	}
	@Override
	public List<Trips> searchTripByCar_no(Integer car_no) {
		// TODO Auto-generated method stub
		return repo.searchTripsByCar_no(car_no);
	}

	@Override
	public List<Trips> searchTripByPassenger(String Customer_name) {
		// TODO Auto-generated method stub
		
		return repo.searchTripsByPassenger(Customer_name);
	}


	

}