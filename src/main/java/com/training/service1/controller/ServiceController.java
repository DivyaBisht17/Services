package com.training.service1.controller;

import com.training.service1.model.Employee;
import com.training.service1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ServiceController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/getAllEmployee")
    //http://localhost:8080/api/v1/getAllEmployee

    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

}
