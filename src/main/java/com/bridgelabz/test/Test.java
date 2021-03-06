package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.Student;  


public class Test {

	public static void main(String[] args) {
		//find the xml file
		//Resource resource=(Resource) new ClassPathResource("student.xml");
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		
		//load the xml file into container
		//BeanFactory beanfactory=new XmlBeanFactory((org.springframework.core.io.Resource) resource); 
		
		//create the object of the class
		Object obj= context.getBean("std");
		//cast to the Student class
		Student student1=(Student)obj;
		Student student2=(Student)obj;
		Student student3=(Student)obj;
		Student student=(Student)obj;
		
		student.display();
		student.display();
		student.display();
		
		System.out.println(student1==student2);
		System.out.println(student1==student3);

	}

}
