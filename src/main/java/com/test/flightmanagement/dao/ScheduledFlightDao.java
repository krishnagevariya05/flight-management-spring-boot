package com.test.flightmanagement.dao;

import com.test.flightmanagement.model.ScheduledFlight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ScheduledFlightDao extends CrudRepository<ScheduledFlight, BigInteger> {

}
