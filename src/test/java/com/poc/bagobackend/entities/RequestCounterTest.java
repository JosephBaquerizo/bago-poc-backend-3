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

}