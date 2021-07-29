package com.parser.practise;

//pojo class to make parser conversion

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value = {
	"Name",
	"Gender",
	"id",
	"Salary"
	
})
public class Employee {
	 
 private String Name,Gender;
 private int id,Salary;
 
 public Employee(String Name, String Gender,int id,int Salary) {
	 
	 this.Name = Name;
	 this.Gender =  Gender;
	 this.id = id;
	 this.Salary = Salary;
 }
 
     public String getname() {
    	 return Name;
     }
     public String getgender() {
    	 return Gender;
     }
     public int getID() {
    	 return id;
     }
     public int getsalary() {
    	 return Salary;
     }
     
     public void setname(String Name) {
    	 this.Name = Name;
     }
     public void setgender(String Gender) {
    	 this.Gender = Gender;
     }
     public void setID(int id) {
    	 this.id = id;
     }
     public void setsalary(int Salary) {
    	 this.Salary = Salary;
     }
     
     @Override
     public String toString() {
    	 return "Name : " + Name + "\n" + "id : " + id +  "\n" + "Gender : " + Gender +  "\n" + "Salary : " + Salary ;
     }
     public Employee() {
    	 
     }
}
