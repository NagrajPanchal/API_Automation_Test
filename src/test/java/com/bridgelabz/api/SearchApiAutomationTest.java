//*******************************************
//Author Name : Nagraj Panchal
//Project     : API Automation Test : Search
//Date        : 01/02/2023
//*******************************************

package com.bridgelabz.api;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SearchApiAutomationTest extends RestApiAutomationBaseVariablesTest
{
    @Test
    public void getSearchFor_Items()
    {
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .when()
                .get("https://api.spotify.com/v1/search?q=Kumar Sanu&type=track");
        result.prettyPrint();
        result.then().assertThat().statusCode(200);
    }
}
