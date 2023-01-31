package com.bridgelabz.api;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PlaylistsApiAutomationTest extends RestApiAutomationTest
{
    @Test
    public void createPlayList()
    {
        System.out.println("User Id : "+userId);
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .body("{\n" +
                        "  \"name\": \"Latest Kannada Playlist\",\n" +
                        "  \"description\": \"New playlist description\",\n" +
                        "  \"public\": false\n" +
                        "}")
                .when()
                .post("https://api.spotify.com/v1/users/"+userId+"/playlists");
        result.prettyPrint();
        result.then().assertThat().statusCode(201);
    }

    @Test
    public void getCurrent_Users_Playlists()
    {

    }
}
