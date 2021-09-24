package com.test.flightmanagement.service;

import com.test.flightmanagement.model.Booking;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;

public interface BookingService {

    ResponseEntity<?> createBooking(Booking newBooking);

    Booking updateBooking(Booking newBooking);

    String deleteBooking(BigInteger bookingId);

    Iterable<Booking> displayAllBooking();

    ResponseEntity<?> findBookingById(BigInteger bookingId);
}
