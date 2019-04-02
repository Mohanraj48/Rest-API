package com.qa.api;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Put_Delete 
{

	@Test
	public void apiTest()
	{
		
		RequestSpecification req=RestAssured.given();
		req.header("Content-Type", "application/json");
		JSONObject json=new JSONObject();
		json.put("id", "13");
		json.put("title", "Wings of Fire");
		json.put("author", "Dr. APJ. Abdul Kalam");
		
		req.body(json.toString());
		Response res=req.post("http://localhost:3000/posts");
		
		int code=res.getStatusCode();
		System.out.println("The response code is ======>	"+code);
		Assert.assertEquals(code, 201);
		
	}
	
	
	
}
