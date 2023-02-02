package com.training.service1.serviceImpl;

import com.training.service1.model.Employee;
import com.training.service1.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getAll() {
        List<Employee> getAll =new ArrayList<>();
        Employee e1 = new Employee(1,"Divya","Bisht","divyabishtdwt@gmail.com",8126516830l);
        Employee e2 = new Employee(2,"Anjali","Rawat","anjalirawatdwt@gmail.com",9126516830l);
        Employee e3 = new Employee(3,"Divya","Pandey","divyapandeydwt@gmail.com",7126516830l);
        Employee e4 = new Employee(4,"Babita","Aarya","babitaaaryadwt@gmail.com",6126516830l);
        Employee e5 = new Employee(5,"Deepshikha","Aarya","deepshikaaaryadwt@gmail.com",5126516830l);
        getAll.add(e1);
        getAll.add(e2);
        getAll.add(e3);
        getAll.add(e4);
        getAll.add(e5);
        return getAll;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }
    @Override
    public Employee deleteEmployee(int id) {
        return null;
    }
}
