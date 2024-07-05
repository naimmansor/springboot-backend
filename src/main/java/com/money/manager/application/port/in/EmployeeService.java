package com.money.manager.application.port.in;

import com.money.manager.domain.entity.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee);

    ResponseEntity<Employee> getEmployeeById(Long id);

    ResponseEntity<Employee> updateEmployee(Long id, Employee employeeDetails);

    ResponseEntity<Map<String, Boolean>> deleteEmployee(Long id);
}
