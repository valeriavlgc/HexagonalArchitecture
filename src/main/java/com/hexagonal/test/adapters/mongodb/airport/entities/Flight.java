package com.hexagonal.test.adapters.mongodb.airport.entities;

import org.springframework.beans.BeanUtils;
import org.springframework.data.mongodb.core.mapping.Document;

import com.hexagonal.test.domain.models.airport.FlightDto;

@Document
public class Flight {

	String id;
	String name;
	int duration;
	
    public FlightDto toFlightDto() {
    	FlightDto flightDto = new FlightDto();
    	BeanUtils.copyProperties(this, flightDto);
    	
    	return flightDto;
    	
    }


}
