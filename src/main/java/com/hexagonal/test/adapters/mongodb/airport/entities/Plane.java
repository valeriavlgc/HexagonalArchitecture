package com.hexagonal.test.adapters.mongodb.airport.entities;

import org.springframework.beans.BeanUtils;
import org.springframework.data.mongodb.core.mapping.Document;

import com.hexagonal.test.domain.models.airport.PlaneDto;

@Document
public class Plane {
	
	String id;
	String name;
	String model;
	
    public PlaneDto toPlaneDto() {
    	
     PlaneDto planeDto = new PlaneDto();
     BeanUtils.copyProperties(this, planeDto);
     
     return planeDto;   
    	
    }
	
	

}
