package com.aca;

public class Student {
	
	public String getName(){
		String name = "Dustin";
		return name;
	}

	public String getFullName(String lastName){
		String name = "Dustin" + lastName;
		return name;
	}
}
