package com.codeclan.example.EmployeeService.repositories;

import com.codeclan.example.EmployeeService.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
