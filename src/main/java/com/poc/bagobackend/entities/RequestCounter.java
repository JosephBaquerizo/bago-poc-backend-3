package com.poc.bagobackend.entities;

import org.springframework.stereotype.Component;

@Component
public class RequestCounter {

    private long requestCount;

    public void incrementRequestCount() {
        requestCount++;
    }

    public long getRequestCount() {
        return requestCount;
    }

}
