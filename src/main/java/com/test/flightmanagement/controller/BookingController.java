package com.test.flightmanagement.controller;

import com.test.flightmanagement.exceptions.RecordAlreadyPresentException;
import com.test.flightmanagement.exceptions.RecordNotFoundException;
import com.test.flightmanagement.model.Booking;
import com.test.flightmanagement.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@CrossOrigin("http://localhost:4200")
@ComponentScan(basePackages = "com")
@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired(required = true)
    BookingService bookingService;

    @PostMapping("/createBooking")
    @ExceptionHandler(RecordAlreadyPresentException.class)
    public void addBooking(@RequestBody Booking newBooking) {

        bookingService.createBooking(newBooking);
    }

    @GetMapping("/readAllBooking")
    public Iterable<Booking> readAllBookings() {

        return bookingService.displayAllBooking();
    }

    @PutMapping("/updateBooking")
    @ExceptionHandler(RecordNotFoundException.class)
    public void modifyBooking(@RequestBody Booking updateBooking) {

        bookingService.updateBooking(updateBooking);
    }

    @GetMapping("/searchBooking/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<?> searchBookingByID(@PathVariable("id") BigInteger bookingId) {

        return bookingService.findBookingById(bookingId);
    }

    @DeleteMapping("/deleteBooking/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public void deleteBookingByID(@PathVariable("id") BigInteger bookingId) {

        bookingService.deleteBooking(bookingId);
    }
}
