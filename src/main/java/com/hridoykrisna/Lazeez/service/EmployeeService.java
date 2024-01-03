package com.hridoykrisna.Lazeez.service;

import com.hridoykrisna.Lazeez.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> employeeList();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(int id);

    List<Employee> driverList();
}
