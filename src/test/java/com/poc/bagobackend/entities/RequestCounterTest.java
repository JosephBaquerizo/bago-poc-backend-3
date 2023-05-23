package com.poc.bagobackend.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestCounterTest {

    @Test
    void testIncrementRequestCount() {
        RequestCounter requestCounter = new RequestCounter();
        requestCounter.incrementRequestCount();
        requestCounter.incrementRequestCount();
        assertEquals(2, requestCounter.getRequestCount());
    }

    @Test
    void testIncrementRequestCount2() {
        RequestCounter requestCounter = new RequestCounter();
        requestCounter.incrementRequestCount();
        assertEquals(1, requestCounter.getRequestCount());
    }

    @Test
    void testGetRequestCount() {
        RequestCounter requestCounter = new RequestCounter();
        assertEquals(0, requestCounter.getRequestCount());
    }

    @Test
    void testIncrementRequestCount3() {
        RequestCounter requestCounter = new RequestCounter();

        requestCounter.incrementRequestCount();
        long countAfterFirstIncrement = requestCounter.getRequestCount();
        assertEquals(1, countAfterFirstIncrement);

        requestCounter.incrementRequestCount();
        long countAfterSecondIncrement = requestCounter.getRequestCount();
        assertEquals(2, countAfterSecondIncrement);

    }

}