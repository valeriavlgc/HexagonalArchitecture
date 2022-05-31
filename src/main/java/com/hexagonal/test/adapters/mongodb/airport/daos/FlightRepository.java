package com.hexagonal.test.adapters.mongodb.airport.daos;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.hexagonal.test.adapters.mongodb.airport.entities.Flight;

public interface FlightRepository extends MongoRepository<Flight, String> {

}
