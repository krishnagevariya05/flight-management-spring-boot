package com.test.flightmanagement.service;

import com.test.flightmanagement.model.Flight;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;

public interface FlightService {
    ResponseEntity<?> addFlight(Flight flight);

    Iterable<Flight> viewAllFlight();

    Flight viewFlight(BigInteger flightNumber);

    Flight modifyFlight(Flight flight);

    String removeFlight(BigInteger flightNumber);

}
