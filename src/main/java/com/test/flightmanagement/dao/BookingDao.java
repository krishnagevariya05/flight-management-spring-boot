package com.test.flightmanagement.dao;

import com.test.flightmanagement.model.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface BookingDao extends CrudRepository<Booking, BigInteger> {

}
