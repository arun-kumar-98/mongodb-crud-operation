package com.tectoro.repository;

import com.tectoro.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends MongoRepository<Employee,Integer> {
}
