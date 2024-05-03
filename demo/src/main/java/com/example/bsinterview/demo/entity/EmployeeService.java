package com.example.bsinterview.demo.entity;

import com.example.bsinterview.demo.DAO.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){

        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}