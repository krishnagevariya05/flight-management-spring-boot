package com.test.flightmanagement.controller;

import com.test.flightmanagement.exceptions.RecordAlreadyPresentException;
import com.test.flightmanagement.exceptions.RecordNotFoundException;
import com.test.flightmanagement.model.Flight;
import com.test.flightmanagement.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/flight")
public class FlightController {
    @Autowired(required = true)
    FlightService flightService;

    @PostMapping("/addFlight")
    @ExceptionHandler(RecordAlreadyPresentException.class)
    public void addFlight(@RequestBody Flight flight) {
        flightService.addFlight(flight);
    }

    @GetMapping("/allFlight")
    public Iterable<Flight> viewAllFlight() {
        return flightService.viewAllFlight();
    }

    @GetMapping("/viewFlight/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public Flight viewFlight(@PathVariable("id") BigInteger flightNo) {
        return flightService.viewFlight(flightNo);
    }

    @PutMapping("/updateFlight")
    @ExceptionHandler(RecordNotFoundException.class)
    public void modifyFlight(@RequestBody Flight flight) {
        flightService.modifyFlight(flight);
    }

    @DeleteMapping("/deleteFlight/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public void removeFlight(@PathVariable("id") BigInteger flightNo) {
        flightService.removeFlight(flightNo);
    }
}
