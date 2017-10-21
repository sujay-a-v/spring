package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.PrivateConstructor;

public class TestPrivate {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("private.xml");
		
		Object obj=context.getBean("pc");
		PrivateConstructor pc=(PrivateConstructor) obj;
	}

}
