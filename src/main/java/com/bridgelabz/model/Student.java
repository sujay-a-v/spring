package com.bridgelabz.model;

public class Student {
	String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public Student()
	{
		System.out.println("Object created......");
	}
	
	public void display()
	{
		System.out.println("Hi...."+name);
	}

}
