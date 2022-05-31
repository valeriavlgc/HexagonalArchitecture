package com.hexagonal.test.adapters.rest.airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hexagonal.test.constants.Constants;
import com.hexagonal.test.domain.models.airport.PlaneDto;
import com.hexagonal.test.domain.services.airport.PlaneService;

@RestController
@RequestMapping(Constants.PLANES)
public class PlaneResource {
	
	private final PlaneService planeService;
	
	@Autowired
	public PlaneResource (PlaneService planeService) {
		this.planeService = planeService;
	}
	
	@GetMapping(Constants.PLANE_ID)
	public PlaneDto planeById(@PathVariable String id) {
		
		return this.planeService.findById(id);
		
	}
	
	
	
	
	
	

}
