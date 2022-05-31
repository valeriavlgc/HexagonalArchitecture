package com.hexagonal.test.domain.services.airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexagonal.test.domain.models.airport.FlightDto;
import com.hexagonal.test.domain.persistencePorts.airport.FlightPersistence;

@Service
public class FlightService {
	
	private final FlightPersistence flightPersistence;
	
	@Autowired
	public FlightService (FlightPersistence flightPersistence) { 
		this.flightPersistence = flightPersistence;
	}
	
	
	public FlightDto findById (String id) {
		return this.flightPersistence.findById(id);
	}
	
	
	

}
