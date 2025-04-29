package com.bradltr95;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

class SoftwareEngineerControllerTest {
    @Test
    void testGetSoftwareEngineer() {
        Response response = RestAssured.get("http://localhost:8080/api/v1/software-engineers");
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}