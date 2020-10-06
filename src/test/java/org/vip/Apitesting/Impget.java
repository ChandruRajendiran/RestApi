package org.vip.Apitesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Impget {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://chandruautomation11.atlassian.net/";
		
		Response res=		RestAssured.given().header("Content-Type","application/json").auth().preemptive().basic("chandrurajendiran343@gmail.com", "ffm04ZrAzptcH0tTMZeb31D6").when().get("rest/api/2/issue");


		int code=res.getStatusCode();
		System.out.println(code);

		String s=res.asString();
		System.out.println(s);
	}

}
