package com.poc.bagobackend.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestCounterTest {

    private RequestCounter requestCounter;

    @Test
    public void testIncrementRequestCount() {
        RequestCounter requestCounter = new RequestCounter();
        requestCounter.incrementRequestCount();
        requestCounter.incrementRequestCount();
        assertEquals(2, requestCounter.getRequestCount());
    }

    @Test
    public void testIncrementRequestCount2() {
        RequestCounter requestCounter = new RequestCounter();
        requestCounter.incrementRequestCount();
        assertEquals(1, 2);
    }

    @Test
    public void testGetRequestCount() {
        RequestCounter requestCounter = new RequestCounter();
        assertEquals(0, requestCounter.getRequestCount());
    }

}