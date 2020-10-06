package org.vip.Apitesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Authendicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://chandruautomation11.atlassian.net/";
		Response res=RestAssured.given().header("Content-Type","application/json").auth().preemptive().basic("chandrurajendiran343@gmail.com", "ffm04ZrAzptcH0tTMZeb31D6").when().get("/rest/api/2/search");
	
		
		int code=res.getStatusCode();
		System.out.println(code);
		ResponseBody body=res.getBody();
		
	String s=	body.asString();
		
		System.out.println(s);

	}

}
