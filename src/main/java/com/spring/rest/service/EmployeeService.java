package com.spring.rest.service;

import com.spring.rest.exception.EmployeeNotFoundException;
import com.spring.rest.model.Employee;
import com.spring.rest.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    public Employee saveEmployee(Employee employee) {
        logger.info("Saving employee: {}", employee);
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        logger.info("Fetching all employees from repository");
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(String id) {
        logger.info("Fetching employee with id: {}", id);
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
    }

}
