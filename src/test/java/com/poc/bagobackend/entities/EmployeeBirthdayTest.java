package com.poc.bagobackend.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeBirthdayTest {

    EmployeeBirthday employee;

    @BeforeEach
    void setUp() {
        employee = new EmployeeBirthday(
                "Rodriguez Martinez Jose Guillermo",
                "Mayo-02",
                "jrodriguez@gmail.com",
                "0992837746",
                "Visitador a Medico"
        );
    }

    @Test
    void testNombreEmployee() {
        String expected = "Rodriguez Martinez Jose Guillermo";
        String actual = employee.getName();
        assertEquals(expected, actual);
        assertNotSame("Jaen Mendoza Jose Julian", actual);
    }

    @Test
    void testFechaEmployee() {
        String expected = "Mayo-02";
        String actual = employee.getBirthday();
        assertEquals(expected, actual);
        assertNotSame("Mayo-01" ,actual);
    }

    @Test
    void testEmailEmployee() {
        String expected = "jrodriguez@gmail.com";
        String actual = employee.getEmail();
        assertEquals(expected, actual);
        assertNotSame("delpiero@gmail.com", actual);
    }

    @Test
    void testPhoneEmployee() {
        String expected = "0992837746";
        String actual = employee.getPhone();
        assertEquals(expected, actual);
        assertNotSame("0997354435", actual);
    }

    @Test
    void testPositionEmployee() {
        String expected = "Visitador a Medico";
        String actual = employee.getPosition();
        assertEquals(expected, actual);
        assertNotSame("Lider", actual);
    }

}