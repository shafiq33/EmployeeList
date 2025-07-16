package com.employee.controller;

import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping; 

@RestController
public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/api/v1/employees")
  public ResponseEntity<List<Employee>> fetchAllEmployees() {
      return ResponseEntity.ok(employeeService.fetchAllEmployees());
  }
}
