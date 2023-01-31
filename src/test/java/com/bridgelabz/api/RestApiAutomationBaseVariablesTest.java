package com.bridgelabz.api;

import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.given;

public class RestApiAutomationBaseVariablesTest
{
    public String Authorization;
    public static String userId;
    @BeforeTest
    public void setUp()
    {
        Authorization = "Bearer BQA3is1hPUj0UE2BWqcfhSnRSo9SFVkU6S5Rii9ZtlgnysFRZJBOV9mBKtK2Z1M2WnvZbPTxk-k6bfkh8-NtRt2b3OFiPuezTmdjKL4CSePc574ryWMHZpEZmYyFb86QF_FDfNEIOABm0hJV5yxyRnk7C1InbaliPaBRIca7z1y1MgWuXVBFOXt7WC5-Dmn9uT8vik95lcaDgNW3f-8qYxeFFhQvg_E8G054xIyWW7bxqn5NwLarYxxAhKXmJtwQ8CYTg0jG2zs5LatepS1X";
        userId = "31qttizveizts3pqmixcdu3gq5ye";
    }
}

