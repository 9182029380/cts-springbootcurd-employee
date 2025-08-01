package com.cts.EmployeeInfo.repository;

import com.cts.EmployeeInfo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepo extends JpaRepository<Employee,Integer> {
}
