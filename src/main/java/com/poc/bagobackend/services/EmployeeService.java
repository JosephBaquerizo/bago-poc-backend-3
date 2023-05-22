package com.poc.bagobackend.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.poc.bagobackend.entities.Employee;

import com.poc.bagobackend.entities.EmployeeBirthday;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    public List<Employee> getEmployees() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper = new ObjectMapper();
        File file = new File("src/main/resources/employees.json");
        Employee[] employees = mapper.readValue(file, Employee[].class);
        return Arrays.asList(employees);
    }

    public List<EmployeeBirthday> getEmployeesBirthdays() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/birthdays.json");
        EmployeeBirthday[] employees = mapper.readValue(file, EmployeeBirthday[].class);
        return Arrays.asList(employees);
    }

}
