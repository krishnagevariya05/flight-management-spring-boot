package com.test.flightmanagement.service;

import com.test.flightmanagement.model.Users;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;

public interface UserService {

    ResponseEntity<?> createUser(Users newUser);

    Users updateUser(Users newUser);

    String deleteUser(BigInteger UserId);

    Iterable<Users> displayAllUser();

    ResponseEntity<?> findUserById(BigInteger userId);
}