package com.bridgelabz.model;

public class ConstructorArg {
	
	private int age;
	private String name;
	private String email;
	

	public ConstructorArg(int age,String name,String email)
	{
		this.age=age;
		this.name=name;
		this.email=email;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Email : "+email);
	}

}
