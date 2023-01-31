//**********************************************
//Author Name : Nagraj Panchal
//Project     : API Automation Test : Play List
//Date        : 31/01/2023
//***********************************************

package com.bridgelabz.api;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PlaylistsApiAutomationTest extends RestApiAutomationBaseVariablesTest
{
    @Test
    public void createPlayList_Using_JSONObject()
    {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","Latest Kannada1 Playlist");
        requestBody.put("description","New kannada playlist description");
        requestBody.put("public","false");

        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .body(requestBody.toJSONString())
                .when()
                .post("https://api.spotify.com/v1/users/"+userId+"/playlists");
        result.prettyPrint();
        result.then().assertThat().statusCode(201);
    }

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
    public void add_Items_to_Playlist()
    {
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .when()
                .post("https://api.spotify.com/v1/playlists/"+hindiSongsPlayList+"/tracks?uris=spotify:track:52kQS6EanAQeM5CYiMOOtA");
        result.prettyPrint();
        result.then().assertThat().statusCode(201);
    }

    @Test
    public void getCurrent_Users_Playlists()
    {
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .when()
                .get("https://api.spotify.com/v1/me/playlists");
        result.prettyPrint();
        result.then().assertThat().statusCode(200);
    }

    @Test
    public void getPlaylist()
    {
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .when()
                .get("https://api.spotify.com/v1/playlists/"+hindiSongsPlayList);
        result.prettyPrint();
        result.then().assertThat().statusCode(200);
    }
    @Test
    public void getPlaylist_Items()
    {
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .when()
                .get("https://api.spotify.com/v1/playlists/"+hindiSongsPlayList+"/tracks");
        result.prettyPrint();
        result.then().assertThat().statusCode(200);
    }

    @Test
    public void getUsers_Playlists()
    {
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .when()
                .get("https://api.spotify.com/v1/users/"+userId+"/playlists");
        result.prettyPrint();
        result.then().assertThat().statusCode(200);
    }

    @Test
    public void getPlaylist_Cover_Image()
    {
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .when()
                .get("https://api.spotify.com/v1/playlists/"+hindiSongsPlayList+"/images");
        result.prettyPrint();
        result.then().assertThat().statusCode(200);
    }

    @Test
    public void remove_Playlist_Items()
    {
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .when()
                .delete("https://api.spotify.com/v1/playlists/"+hindiSongsPlayList+"/tracks?uri=52kQS6EanAQeM5CYiMOOtA");
        result.prettyPrint();
    }

    @Test
    public void change_Playlist_Details()
    {
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .body("{\n" +
                        "  \"name\": \"old is Gold\",\n" +
                        "  \"description\": \"Updated old is gold\",\n" +
                        "  \"public\": false\n" +
                        "}")
                .when()
                .put("https://api.spotify.com/v1/playlists/5AJQuzEMOHKLCkD1dOGBuz");
        result.prettyPrint();
        result.then().assertThat().statusCode(200);
    }

    @Test
    public void update_Playlist_Items()
    {
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .body("{\n" +
                        "  \"range_start\": 1,\n" +
                        "  \"insert_before\": 1,\n" +
                        "  \"range_length\": 1\n" +
                        "}")
                .when()
                .put("https://api.spotify.com/v1/playlists/5AJQuzEMOHKLCkD1dOGBuz/tracks");
        result.prettyPrint();
        result.then().assertThat().statusCode(200);
    }

    @Test
    public void add_Custom_Playlist_Cover_Image()
    {
        Response result = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization",Authorization)
                .when()
                .put("https://api.spotify.com/v1/playlists/5AJQuzEMOHKLCkD1dOGBuz/images");
        result.prettyPrint();
        result.then().assertThat().statusCode(200);
    }

}
