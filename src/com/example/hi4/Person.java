package com.example.hi4;

public class Person {
	
	public Person(String name, String gender){		
		this.gender = gender;
		this.name = name;		
	}
	
	public String name;
	private String gender;
	
	public String getName(){
		return name;
	}
	public String getGender(){
		return gender;
	}
}