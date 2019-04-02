package com.qa.api;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutApiEntity 
{

	@Test
	public void apiTest()
	{
		
		RequestSpecification req=RestAssured.given();
		req.header("Content-Type", "application/json");
		JSONObject json=new JSONObject();
		json.put("id", "11");
		json.put("title", "Quantitive Apptitude-II");
		json.put("author", "R.S.Agarwal");
		
		req.body(json.toString());
		Response res=req.put("http://localhost:3000/posts/11");
		
		int code=res.getStatusCode();
		System.out.println("The response code is ======>	"+code);
		Assert.assertEquals(code, 200);
		
	}
	
	
	
}
