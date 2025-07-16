package com.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/api/v1/employees")
  public ResponseEntity<List<Employee>> fetchAllEmployees() {
      return ResponseEntity.ok(employeeService.fetchAllEmployees());
  }

   @PostMapping("/api/v1/employees")
  public ResponseEntity<List<Employee>> createEmployee(@RequestBody Employee employee) {
      return ResponseEntity.ok(employeeService.createEmployee());
  }
  
}
