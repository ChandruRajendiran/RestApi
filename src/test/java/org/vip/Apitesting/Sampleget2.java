package org.vip.Apitesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Sampleget2 {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/";
		Response res=RestAssured.given().header("Content-Type","application/json").when().get("/api/unknown");
	
		
		int code=res.getStatusCode();
		System.out.println(code);
		ResponseBody body=res.getBody();
		
	String s=	body.asString();
		
		System.out.println(s);
	}

}
