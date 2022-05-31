package com.hexagonal.test.adapters.mongodb.airport.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hexagonal.test.adapters.mongodb.airport.daos.FlightRepository;
import com.hexagonal.test.domain.models.airport.FlightDto;
import com.hexagonal.test.domain.persistencePorts.airport.FlightPersistence;

//Aquí indico la persistencia del dominio.
@Repository("flightPersistence")
public class FlightPersistenceMongodb implements FlightPersistence {
	
	private final FlightRepository flightRepository;
	
	@Autowired 
	public FlightPersistenceMongodb (FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}
	

	//Hago la conversión a DTO aquí. 
	@Override
	public FlightDto findById(String id) {
		return this.flightRepository.findById(id).get().toFlightDto();
	}
	
	

}
