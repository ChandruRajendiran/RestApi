package org.vip.Apitesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Sample {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

	
		RestAssured.baseURI="https://reqres.in";
	Response res=	RestAssured.given().header("Content-Type","application/json").queryParam("page", "2").when().get("/api/users/2");
		
		int code=res.getStatusCode();
		System.out.println(code);
		ResponseBody responseBody=res.getBody();
		
		String sru=responseBody.asString();
		
		System.out.println(sru);
		
	}

}
