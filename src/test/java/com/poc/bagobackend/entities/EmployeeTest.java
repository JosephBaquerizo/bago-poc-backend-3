package com.poc.bagobackend.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

class EmployeeTest {

    Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee(
                1,
                "Rodrigo Rodriguez",
                new Country("Ecuador", "ECU"),
                "Alaisa",
                new Date(),
                "negociando",
                true,
                30,
                new Representative("Juan Raul", "imagen"),
                120
        );
    }

    @Test
    void testEmployeeId() {
        int esperado = 1;
        int actual = employee.getId();
        assertEquals(esperado, actual);
        assertNotSame(2, actual);
    }

    @Test
    void testEmployeeName() {
        String esperado = "Rodrigo Rodriguez";
        String actual = employee.getName();
        assertEquals(esperado, actual);
        assertNotSame("Jose Jose", actual);
    }

    @Test
    void testEmployeeCountry() {
        Country esperado = new Country("Ecuador", "ECU");
        Country actual = employee.getCountry();
        assertEquals(esperado.getName(), actual.getName());
        assertNotSame("Bolivia", actual.getName());
    }

    @Test
    void testEmployeeCompany() {
        String esperado = "Alaisa";
        String actual = employee.getCompany();
        assertEquals(esperado, actual);
        assertNotSame("Ticumbe", actual);
    }

    @Test
    void testEmployeeStatus() {
        String esperado = "negociando";
        String actual = employee.getStatus();
        assertEquals(esperado, actual);
        assertNotSame("terminado", actual);
    }

}