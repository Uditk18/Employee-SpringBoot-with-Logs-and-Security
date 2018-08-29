package com.cg.rest.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.rest.pojo.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
