package org.vip.Apitesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Sampleput {
	
	public static void main(String[] args) {
		
		
		RestAssured.baseURI="https://reqres.in";		
		Response res=RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}").when().put("/api/users/2");
		int code=res.getStatusCode();
		
		System.out.println(code);
		ResponseBody resposeBody=res.getBody();
		
	String s=	resposeBody.asString();
	System.out.println(s);
	}

}
