package org.vip.Apitesting;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ImpPost {

	public static void main(String[] args) throws ParseException {

		// TODO Auto-generated method stub
		RestAssured.baseURI="https://chandruautomation11.atlassian.net/";
		
Response res=		RestAssured.given().header("Content-Type","application/json").auth().preemptive().basic("chandrurajendiran343@gmail.com", "ffm04ZrAzptcH0tTMZeb31D6").when().body("{\r\n" + 
		"{\r\n" + 
		"	\"fields\": {\r\n" + 
		"		\"project\": {\r\n" + 
		"			\"key\": \"CHAN\"\r\n" + 
		"		},\r\n" + 
		"\r\n" + 
		"		\"summary\": \"Always do right. This will gratify some people and astonish the REST.\",\r\n" + 
		"\r\n" + 
		"		\"description\": \"Creating an issue while setting custom field values\"\r\n" + 
		"	}\r\n" + 
		"}").post("rest/api/2/issue");


int code=res.getStatusCode();
System.out.println(code);

String s=res.asString();
System.out.println(s);

JSONParser jsonparser = new JSONParser();

Object ob=jsonparser.parse(s);
JSONObject obj= (JSONObject)ob;

String ss= (String)obj.get("key");
System.out.println(ss);
	}

}
