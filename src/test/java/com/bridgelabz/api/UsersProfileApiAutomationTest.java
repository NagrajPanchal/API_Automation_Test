package com.bridgelabz.api;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UsersProfileApiAutomationTest extends RestApiAutomationBaseVariablesTest
{
    @Test
    public void getCurrentUserProfile()
    {
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .when()
                .get("https://api.spotify.com/v1/me");
        String userId = result.path("id");
        System.out.println("USerId : "+userId);
        String userName = result.path("display_name");
        result.prettyPrint();
        result.then().assertThat().statusCode(200);
        Assert.assertEquals("Panchal",userName);
    }

    @Test
    public void getUsersProfile()
    {
        System.out.println("UserId : "+userId);
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .when()
                .get("https://api.spotify.com/v1/users/"+userId);
        result.prettyPrint();
        result.then().assertThat().statusCode(200);
    }
}
