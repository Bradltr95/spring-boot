package com.bradltr95;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class SoftwareEngineerDeleteTest {
    @BeforeMethod
    public void
    createEngineerRecord() {
        // This consumes unecessary resources and will get
        // removed once we package our tests together in a way
        // that this redudent call can be removed.

        // For now, it assists in creating the data necessary
        // To get the tests running.
        Response response = RestAssured.given().
            body("{\"name\":\"Alice\",\"techStack\":\"Java, Spring\"}").
            contentType("application/json").
            when().
            post("/api/v1/software-engineers");
    }

    @Test public void
    delete_existing_engineer_record() {
        when().
        delete("/api/v1/software-engineers/1").
        then().
        statusCode(STATUS_CODE.SUCCESS);
    }
}
