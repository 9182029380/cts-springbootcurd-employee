package com.cts.EmployeeInfo.controller;

import com.cts.EmployeeInfo.model.Employee;
import com.cts.EmployeeInfo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/cts")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public Employee createemployee(@RequestBody Employee emp){
        return service.create(emp);
    }
    @GetMapping
    public List<Employee> getallemployees(){
        return service.getallemployees();
    }
}
