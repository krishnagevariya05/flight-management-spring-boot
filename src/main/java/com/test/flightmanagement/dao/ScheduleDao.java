package com.test.flightmanagement.dao;

import com.test.flightmanagement.model.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ScheduleDao extends CrudRepository<Schedule, BigInteger> {

}
