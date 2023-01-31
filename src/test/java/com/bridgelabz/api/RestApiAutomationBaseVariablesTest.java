//*******************************************
//Author Name : Nagraj Panchal
//Project     : API Automation Test
//Date        : 31/01/2023
//*******************************************

package com.bridgelabz.api;

import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.given;

public class RestApiAutomationBaseVariablesTest
{
    public String Authorization;
    public static String userId;
    public String hindiSongsPlayList;
    public String teluguSongsPlayList;
    public String kannadaSongsPlayList;
    @BeforeTest
    public void setUp()
    {
        Authorization = "Bearer BQBaVY46LA3qvJxg-Uxf0XuDo3rX0GHAOKyq2MI-BMKi-0fW66cdGXoLCMh51T8bPSqT7jBCNXLH_2CxoRvUvDCdqe9bxoBlMTbsFdaORcell-4Ye17gnlrC0QXSnAzThvs__WXgN1UJJGcYyUnoCbNmhLv6XiZ4Ijzn7nv9SP65L9f8cHuI7f4Sl7bgY4FyAF32P5aiDTCSC2XJvjRTRJ7FiXa3MZ_Blvn-PsA348ZS3H5z-RhWY_DlEFGv6DRKxxe6BK0TKNBfoorpE-qfBHPNW3VZwYO-_L6i6xoSqycTeXD4";
        userId = "31qttizveizts3pqmixcdu3gq5ye";
        hindiSongsPlayList = "6BbEcngnknqbgNdAXr2QU7";
        teluguSongsPlayList = "5e9cowoojKhjaQC5XT3KbX";
        kannadaSongsPlayList = "4hHBt6Eg8NQGF77nF2Duzp";
    }
}

