package com.qa.api;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteApiEntity 
{

	@Test
	public void apiTest()
	{
		
		RequestSpecification req=RestAssured.given();
		
		Response res=req.delete("http://localhost:3000/posts/10");
		
		int code=res.getStatusCode();
		System.out.println("The response code is ======>	"+code);
		Assert.assertEquals(code, 200);
		
	}
	
	
	
}
