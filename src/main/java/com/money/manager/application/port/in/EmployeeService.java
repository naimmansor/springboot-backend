package com.money.manager.application.port.in;

import com.money.manager.domain.entity.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee);

    ResponseEntity<Employee> getEmployeeById(Long id);

    ResponseEntity<Employee> updateEmployee(Long id, Employee employeeDetails);

    ResponseEntity<Map<String, Boolean>> deleteEmployee(Long id);
}
