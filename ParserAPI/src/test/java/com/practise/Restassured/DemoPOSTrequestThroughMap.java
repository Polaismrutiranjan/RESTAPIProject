package com.practise.Restassured;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class DemoPOSTrequestThroughMap {
	
	@Test
	public void checkPostMap() {
		
		//Create payLoad
		HashMap<String,Object> payLoad = new HashMap<String,Object> ();
	 
	    payLoad.put("Name", "Romeo");
	    payLoad.put("age", 37);
	    payLoad.put("Gender", "Male");
	    payLoad.put("Contact", 444333222);
	   
	    //set the precondition
	    RequestSpecification rs = RestAssured.given();
	    rs.body(payLoad);
	    rs.contentType(ContentType.JSON);
	    
	    //send request along with precondition
	   RequestSender sender = rs.when();
	   Response resp = sender.post("http://localhost:3000/Student");
	
	   //print all complete response
	   ValidatableResponse vr = resp.then();
	   vr.log().all();
	}

}
