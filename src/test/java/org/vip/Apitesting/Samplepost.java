package org.vip.Apitesting;

import static org.junit.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class Samplepost {

	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in";		
	Response res=	 RestAssured.given().header("Content-Type","application/json").body(Payload.PayOne()).when().post("/api/login");

		ResponseBody resposeBody=res.getBody();
		
	String s=	resposeBody.asString();
	System.out.println(s);
//	
	}
}
