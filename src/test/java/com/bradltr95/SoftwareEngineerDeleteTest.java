package com.bradltr95;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class SoftwareEngineerDeleteTest {
    @Test public void
    delete_existing_engineer_record() {
        when().
            delete("/api/v1/software-engineers/1").
        then().
            statusCode(200);
    }
}
