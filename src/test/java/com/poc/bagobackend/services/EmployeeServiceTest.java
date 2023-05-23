package com.poc.bagobackend.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.poc.bagobackend.entities.Country;
import com.poc.bagobackend.entities.Employee;
import com.poc.bagobackend.entities.EmployeeBirthday;
import com.poc.bagobackend.entities.Representative;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.io.File;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    private EmployeeService employeeService;
    private Employee employee;
    private EmployeeBirthday employeeBirthday;

    @BeforeEach
    public void setUp() {
        employeeService = new EmployeeService();
    }

    @Test
    void testGetEmployees() throws Exception {
        List<Employee> result = employeeService.getEmployees();
        assertEquals(500, result.size());
    }

    @Test
    void testGetEmployeesBirthdays() throws Exception {
        List<EmployeeBirthday> result = employeeService.getEmployeesBirthdays();
        assertEquals(12, result.size());
    }

}