package com.test.flightmanagement.dao;

import com.test.flightmanagement.model.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface FlightDao extends CrudRepository<Flight, BigInteger> {

}
