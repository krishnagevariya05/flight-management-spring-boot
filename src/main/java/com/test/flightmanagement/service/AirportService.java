package com.test.flightmanagement.service;

import com.test.flightmanagement.model.Airport;
import org.springframework.http.ResponseEntity;

public interface AirportService {
    Iterable<Airport> viewAllAirport();

    Airport viewAirport(String airportCode);

    ResponseEntity<?> addAirport(Airport airport);

    Airport modifyAirport(Airport airport);

    String removeAirport(String airportCode);
}
