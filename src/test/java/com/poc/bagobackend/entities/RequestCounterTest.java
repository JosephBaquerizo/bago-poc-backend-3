package com.poc.bagobackend.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestCounterTest {

    RequestCounter requestCounter;

    @BeforeEach
    void setUp() {
        requestCounter = new RequestCounter();
    }

    @Test
    void testNombreEmployee() {
        long expected = 1;
        requestCounter.incrementRequestCount();
        long actual = requestCounter.getRequestCount();
        assertEquals(expected, actual);
        assertNotSame(2, actual);
    }

}