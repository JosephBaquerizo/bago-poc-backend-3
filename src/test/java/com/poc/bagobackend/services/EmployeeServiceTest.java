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
    public void testGetEmployees() throws Exception {
        File file = new File("src/test/resources/employees.json");
        List<Employee> result = employeeService.getEmployees();
        assertEquals(500, 5);
    }

    @Test
    public void testGetEmployeesBirthdays() throws Exception {
        File file = new File("src/test/resources/birthdays.json");
        List<EmployeeBirthday> result = employeeService.getEmployeesBirthdays();
        assertEquals(12, result.size());
    }

}