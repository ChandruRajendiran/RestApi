package org.vip.Apitesting;

import java.io.File;

import io.restassured.path.json.JsonPath;

public class Jsonfile2 {

	
	public static void main(String[] args) {
		
		
		JsonPath path= new JsonPath (new File("C:\\Users\\New\\Desktop\\file.json"));
		
		
	Object o=	path.get("data.id");
Object o1=	path.get("data[1].email");
	System.out.println(o);
	System.out.println(o1);
	int a=path.getInt("data.size()");
	System.out.println(a);
	for(int i=0;i<a;i++)
	{
		Object o3=path.getString("data["+ i +"].email");
		System.out.println(o3);
	}
		
	}
}
