package com.bradltr95;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SoftwareEngineerControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testCreateAndGetSoftwareEngineer() {
        // Create a new SoftwareEngineer
        SoftwareEngineer engineer = new SoftwareEngineer(null, "Alice", "Java, Spring");
        ResponseEntity<SoftwareEngineer> postResponse = restTemplate.postForEntity("/api/v1/engineers", engineer, SoftwareEngineer.class);
        assertEquals(201, postResponse.getStatusCode().value());
        SoftwareEngineer createdEngineer = postResponse.getBody();
        assertNotNull(createdEngineer);
        assertNotNull(createdEngineer.getId());

        // Retrieve the created SoftwareEngineer
        ResponseEntity<SoftwareEngineer> getResponse = restTemplate.getForEntity("/api/v1/engineers" + createdEngineer.getId(), SoftwareEngineer.class);
        assertEquals(200, getResponse.getStatusCode().value());
        SoftwareEngineer retrievedEngineer = getResponse.getBody();
        assertNotNull(retrievedEngineer);
        assertEquals("Alice", retrievedEngineer.getName());
        assertEquals("Java, Spring", retrievedEngineer.getTechStack());
    }
}