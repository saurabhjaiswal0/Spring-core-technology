package com.jsp.spring_core_technologies.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("dependency_injection.xml");
		Laptop laptop=(Laptop) context.getBean("laptop");
		System.out.println(laptop);
		
//		OR
//		Laptop laptop=(Laptop)new ClassPathXmlApplicationContext("dependency_injection.xml").getBean("laptop");
		
	}

}
