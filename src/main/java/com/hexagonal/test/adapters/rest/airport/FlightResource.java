package com.hexagonal.test.adapters.rest.airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hexagonal.test.constants.Constants;
import com.hexagonal.test.domain.models.airport.FlightDto;
import com.hexagonal.test.domain.services.airport.FlightService;

@RestController
@RequestMapping(Constants.FLIGHTS)
public class FlightResource {
	
	private final FlightService flightService;
	
	@Autowired
	public FlightResource (FlightService flightService) {
		this.flightService = flightService;		
	}
	
	@GetMapping(Constants.FLIGHT_ID)
	public FlightDto flightById(@PathVariable String id) {
		return this.flightService.findById(id);
		
	}

}
