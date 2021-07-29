package com.parser.practise;

import java.io.File;

public class TestParser {
	public static void main(String[] args) {
		
		/*Employee eobj = new Employee("Smruti", "Male", 21, 30000);
		
		parserJson parser = new parserJson();
		parser.marshalling(eobj);
		
		System.out.println("pass");*/
		
		File file = new File("employee.json");
		parserJson parser = new parserJson();
		Employee eobj = parser.unmarshalling(file, Employee.class);
		
		System.out.println(eobj);
	}
	

}
