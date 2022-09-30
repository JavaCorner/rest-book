package com.ab.quarkus.controller;

import io.quarkus.test.junit.NativeImageTest;
import io.quarkus.test.junit.QuarkusIntegrationTest;
import org.apache.http.HttpHeaders;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusIntegrationTest
public class NativeBookResourceTest extends BookResourceTest {
    // Execute the same tests but in packaged mode.

    @Test
    public void shouldGetABook() {
        given()
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .pathParam("id", 1)
                .when().get("/api/books/{id}")
                .then()
                .statusCode(200)
                .body("title", is("Understanding Quarkus"))
                .body("author", is("Arpit"))
                .body("yearOfPublication", is(2020))
                .body("genre", is("Information Technology"));
    }
}
