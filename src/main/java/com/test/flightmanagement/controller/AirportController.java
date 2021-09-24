package com.test.flightmanagement.controller;


import com.test.flightmanagement.exceptions.RecordAlreadyPresentException;
import com.test.flightmanagement.exceptions.RecordNotFoundException;
import com.test.flightmanagement.model.Airport;
import com.test.flightmanagement.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/airport")
public class AirportController {
    @Autowired(required = true)
    AirportService airportService;

    @GetMapping("/viewAirport/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public Airport viewAirport(@PathVariable("id") String airportCode) {
        return airportService.viewAirport(airportCode);
    }

    @GetMapping("/allAirport")
    public Iterable<Airport> viewAllAirport() {
        return airportService.viewAllAirport();
    }

    @PostMapping("/addAirport")
    @ExceptionHandler(RecordAlreadyPresentException.class)
    public void addAirport(@RequestBody Airport airport) {
        airportService.addAirport(airport);
    }

    @PutMapping("/updateAirport")
    @ExceptionHandler(RecordNotFoundException.class)
    public void modifyAirport(@RequestBody Airport airport) {
        airportService.modifyAirport(airport);
    }

    @DeleteMapping("/deleteAirport/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public void removeAirport(@PathVariable("id") String airportCode) {
        airportService.removeAirport(airportCode);
    }
}
