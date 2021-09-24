package com.test.flightmanagement.controller;

import com.test.flightmanagement.exceptions.RecordAlreadyPresentException;
import com.test.flightmanagement.exceptions.RecordNotFoundException;
import com.test.flightmanagement.model.Users;
import com.test.flightmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@ComponentScan(basePackages = "com")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    @ExceptionHandler(RecordAlreadyPresentException.class)
    public void addUser(@RequestBody Users newUser) {

        userService.createUser(newUser);
    }

    @GetMapping("/readAllUsers")
    public Iterable<Users> readAllUsers() {

        return userService.displayAllUser();
    }

    @PutMapping("/updateUser")
    @ExceptionHandler(RecordNotFoundException.class)
    public void updateUser(@RequestBody Users updateUser) {

        userService.updateUser(updateUser);
    }

    @GetMapping("/searchUser/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<?> searchUserByID(@PathVariable("id") BigInteger userId) {

        return userService.findUserById(userId);
    }

    @DeleteMapping("/deleteUser/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public void deleteBookingByID(@PathVariable("id") BigInteger userId) {

        userService.deleteUser(userId);
    }
}