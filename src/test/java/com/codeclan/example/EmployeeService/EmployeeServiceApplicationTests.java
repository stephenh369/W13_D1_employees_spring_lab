package com.codeclan.example.EmployeeService;

import com.codeclan.example.EmployeeService.models.Employee;
import com.codeclan.example.EmployeeService.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void canAddEmployee() {
		Employee jack = new Employee("Jack Sparrow", 32, 420, "jackSparrow@pirate.com");
		employeeRepository.save(jack);
	}

}
