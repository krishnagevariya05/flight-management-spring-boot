package com.test.flightmanagement.service;

import com.test.flightmanagement.exceptions.RecordNotFoundException;
import com.test.flightmanagement.exceptions.ScheduledFlightNotFoundException;
import com.test.flightmanagement.model.ScheduledFlight;

import java.math.BigInteger;

public interface ScheduledFlightService {
    ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight);

    ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight);

    String removeScheduledFlight(BigInteger id) throws RecordNotFoundException;

    Iterable<ScheduledFlight> viewAllScheduledFlights();

    ScheduledFlight viewScheduledFlight(BigInteger id) throws ScheduledFlightNotFoundException;
    // boolean cancelBookings(BigInteger flightId) throws RecordNotFoundException;

}
