package com.hexagonal.test.domain.persistencePorts.airport;

import com.hexagonal.test.domain.models.airport.PlaneDto;

public interface PlanePersistence {
	
	PlaneDto findById(String id);

}
