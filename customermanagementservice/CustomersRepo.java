package com.example.customermanagementservice.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.customermanagementservice.model.Customers;

@Repository
@Transactional
public interface CustomersRepo extends JpaRepository<customers,String>{
	
	


}
