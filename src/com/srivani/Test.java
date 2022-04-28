package com.srivani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

		Employee student=(Employee)context.getBean("employeeBean1");
		System.out.println(student.displayInfo());
		
	}

}
