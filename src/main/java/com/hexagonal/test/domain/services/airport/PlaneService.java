package com.hexagonal.test.domain.services.airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexagonal.test.domain.models.airport.PlaneDto;
import com.hexagonal.test.domain.persistencePorts.airport.PlanePersistence;

@Service
public class PlaneService {
	
	final private PlanePersistence planePersistence;
	
	@Autowired
	public PlaneService (PlanePersistence planePersistence) {
		this.planePersistence = planePersistence;
		
	}
	
	public PlaneDto findById (String id) {
		return this.planePersistence.findById(id);
	} 
	
	
	

}
