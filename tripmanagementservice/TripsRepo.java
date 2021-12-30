package com.example.tripmanagementservice.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tripmanagementservice.model.Trips;

@Repository
@Transactional
public interface TripsRepo extends JpaRepository<trip_id,Integer>{
	
	


}