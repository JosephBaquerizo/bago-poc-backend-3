package com.poc.bagobackend.controllers;

import com.poc.bagobackend.entities.RequestCounter;
import com.poc.bagobackend.services.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesControllerTest {

    private EmployeesController employeesController;
    private EmployeeService employeeService;
    private RequestCounter requestCounter;

    @BeforeEach
    public void setUp() {
        employeeService = new EmployeeService();
        requestCounter = new RequestCounter();
        employeesController = new EmployeesController(employeeService, requestCounter);
    }

    @Test
    public void testGetEmployees() throws IOException {
        employeesController.getEmployees();
        employeesController.getEmployees();
        employeesController.getEmployees();
        assertEquals(3, requestCounter.getRequestCount());
    }

}