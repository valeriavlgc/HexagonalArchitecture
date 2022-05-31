package com.hexagonal.test.adapters.mongodb.airport.daos;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.hexagonal.test.adapters.mongodb.airport.entities.Plane;

public interface PlaneRepository extends MongoRepository<Plane, String> {

}
