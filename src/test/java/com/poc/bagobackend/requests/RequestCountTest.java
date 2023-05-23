package com.poc.bagobackend.requests;

import com.poc.bagobackend.entities.RequestCounter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RequestCountTest {

    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private RequestCounter requestCounter;

    @Test
    @DisplayName("Requests")
    void testRequestCount() {
        for (int i = 0; i < 10; i++) {
            ResponseEntity<String> response = restTemplate.getForEntity("/api/v1/employees", String.class);
            assertEquals(HttpStatus.OK, response.getStatusCode());
        }
        long requestCount = requestCounter.getRequestCount();
        assertEquals(10, requestCount);
    }

}
