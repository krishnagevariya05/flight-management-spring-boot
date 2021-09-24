package com.test.flightmanagement.dao;

import com.test.flightmanagement.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface UserDao extends CrudRepository<Users, BigInteger> {

}