package com.parser.practise;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class parserJson {
	
	public void marshalling(Employee eobj)
	{
	// create a object of object mapper
       ObjectMapper mapper = new ObjectMapper();
       try {
   // call write value method
		mapper.writeValue(new File("employee.json"), eobj);  // write the object in this file
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
	
	public Employee unmarshalling(File filename , Class<Employee> eobj)
	{
		ObjectMapper mapper = new ObjectMapper();
		Employee employData = null;
		try {
			employData = mapper.readValue(filename, eobj);
		} catch (Exception e) {
	
		}
		 return employData;
	}
}
