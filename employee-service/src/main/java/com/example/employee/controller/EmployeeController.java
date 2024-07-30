package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }

//    @PutMapping("/{id}")
//    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
//        return employeeService.updateEmployee(id, employee);
//    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/branch/{branchId}")
    public List<Employee> getEmployeesByBranchId(@PathVariable String branchId) {
        return employeeService.getEmployeesByBranchId(branchId);
    }
}