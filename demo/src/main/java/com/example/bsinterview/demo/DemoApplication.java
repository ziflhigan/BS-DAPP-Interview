package com.example.bsinterview.demo;

import com.example.bsinterview.demo.entity.Employee;
import com.example.bsinterview.demo.entity.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private EmployeeService employeeService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(EmployeeService service) {
		return (args) -> {
			// Add initial data or test commands here
			System.out.println("Listing all employees:");
			service.findAllEmployees().forEach(System.out::println);
		};
	}

	public Employee addEmployee(Employee employee) {
		return employeeService.saveEmployee(employee);
	}

}
