package com.test.flightmanagement.dao;

import com.test.flightmanagement.model.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportDao extends CrudRepository<Airport, String> {

}
