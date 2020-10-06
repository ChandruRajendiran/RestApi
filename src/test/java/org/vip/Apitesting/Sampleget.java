package org.vip.Apitesting;

import static org.junit.Assert.assertEquals;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Sampleget {

	public static void main(String[] args) {
		
		String id="12";
		
		RestAssured.baseURI="https://reqres.in/";
		Response res=RestAssured.given().queryParam("delay","3").when().get("/api/users");
	
		
		int code=res.getStatusCode();

		
assertEquals(200,code);
		System.out.println(code);
		ResponseBody body=res.getBody();
		
		
	//String s=	body.asString();
	System.out.println("Does the response contains email" +body.asString().contains("email"));
		

	}
}
