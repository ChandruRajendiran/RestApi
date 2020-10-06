package org.vip.Apitesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Sampledelete {
	
	public static void main(String[] args) {
		
	
	
	RestAssured.baseURI="https://reqres.in";		
	Response res=RestAssured.given().header("Content-Type","application/json").when().delete("/api/users");
	int code=res.getStatusCode();
	
	System.out.println(code);
	ResponseBody resposeBody=res.getBody();
	
String s=	resposeBody.asString();
System.out.println(s);

}
}