package com.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
  
  
}
