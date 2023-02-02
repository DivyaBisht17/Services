package com.training.service1.service;

import com.training.service1.model.Employee;

import java.util.List;

public interface EmployeeService {
    //Get
    public List<Employee> getAll();
    //post
    public Employee addEmployee (Employee employee);
    //put
    public  Employee updateEmployee (Employee employee);
    //Delete
    public  Employee deleteEmployee (int id);
}
