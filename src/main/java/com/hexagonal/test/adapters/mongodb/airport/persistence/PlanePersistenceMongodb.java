package com.hexagonal.test.adapters.mongodb.airport.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hexagonal.test.adapters.mongodb.airport.daos.PlaneRepository;
import com.hexagonal.test.domain.models.airport.PlaneDto;
import com.hexagonal.test.domain.persistencePorts.airport.PlanePersistence;

@Repository("PlanePersistence")
public class PlanePersistenceMongodb implements PlanePersistence {
	
	private final PlaneRepository planeRepository;
	
	@Autowired
	public PlanePersistenceMongodb (PlaneRepository planeRepository) {
		this.planeRepository = planeRepository;
		
	}

	@Override
	public PlaneDto findById(String id) {
		return this.planeRepository.findById(id)
				                   //orElseThrow -> create not found exception.
				                   .get()	
				                   .toPlaneDto();
	}
	

}
