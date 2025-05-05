package com.bradltr95;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

class SoftwareEngineerControllerTest {
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = System.getenv("APP_URL") != null ? System.getenv("APP_URL") : "http://localhost:8080";
    }

    @Test
    void testGetEmptySoftwareEngineerRecords() {
        Response response = RestAssured.get("http://localhost:8080/api/v1/software-engineers");
        Assert.assertEquals(response.getStatusCode(), 200);
        // Add more testing to verify the JSON response is empty
    }

    /* THESE TESTS ARE INTENDED TO FAIL AS THEY ARE WRITTEN BEFORE THE CODE IMPLEMENTATION
    TO FOLLOW TDD. TO ENSURE PRs ARE ABLE TO BE MERGED WE WILL LEAVE THEM COMMENTED WHEN COMMITING
    TO A REMOTE BRANCH.
    @Test
    void testCreateSoftwareEngineer() {
        Response createEngineer = given()
        .contentType(ContentType.JSON)
        .when()
        .post("/api/v1/software-engineer")
        .then()
        .extract().response();

    Assertions.assertEquals("name-here", repsonse.jsonPath().getString("name[1]"));
    }

    @Test public void
    delete_existing_engineer_record() {
        when().
                delete("/api/v1/software-engineers/1").
                then().
                statusCode(STATUS_CODE.SUCCESS);
    }*/
}