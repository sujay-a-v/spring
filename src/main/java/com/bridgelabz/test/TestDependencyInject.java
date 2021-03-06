package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.ConstructorArg;
import com.bridgelabz.model.SetterDI;

public class TestDependencyInject {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("DependencyInjection.xml");
		System.out.println("\nConstructor Testing");
		ConstructorArg constructorArg=(ConstructorArg) context.getBean("constructor");
		constructorArg.display();
		
		System.out.println("\n\nSetter Testing");
		SetterDI setter=(SetterDI) context.getBean("setter");
		setter.display();

	}

}
