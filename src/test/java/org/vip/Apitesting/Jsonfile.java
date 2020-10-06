package org.vip.Apitesting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Jsonfile {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stubF
		
		FileReader reader = new FileReader(new File("C:\\Users\\New\\Desktop\\file.json"));
		JSONParser parser1= new JSONParser();
		
		Object o=parser1.parse(reader);
		
	JSONObject object= (JSONObject)o;
	
Object o1=	object.get("data");

JSONArray array=(JSONArray)o1;

Object o2=array.get(2);
JSONObject object2= (JSONObject)o2;

Object o3=object2.get("id");

System.out.println(o3);
	
	}
}