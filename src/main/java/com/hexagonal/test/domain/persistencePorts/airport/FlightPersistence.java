package com.hexagonal.test.domain.persistencePorts.airport;

import com.hexagonal.test.domain.models.airport.FlightDto;

public interface FlightPersistence {
	
	FlightDto findById(String id);

}
