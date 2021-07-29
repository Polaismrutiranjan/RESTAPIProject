package com.practise.Restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoGETrequest {

	@Test
	 public void checkGet() {
	
	Response resp = RestAssured.get("http://localhost:3000/Student");
	 
	    System.out.println("Status Code :" + resp.getStatusCode());
	    System.out.println("Content Type :" + resp.getContentType());
	    System.out.println("Response Time :" + resp.getTime() + "ms");
	    
	    System.out.println("Complete Response is : ");
	    System.out.println(resp.asString());
	}
}
