package com.cts.EmployeeInfo.service;

import com.cts.EmployeeInfo.model.Employee;
import com.cts.EmployeeInfo.repository.Employeerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private Employeerepo repo;

    public Employee create(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getallemployees() {
        return repo.findAll();
    }
}
