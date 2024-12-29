package com.jsp.spring_core_technologies.annotation.variable_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_technologies.annotation.configuration.MyConfig;
import com.jsp.spring_core_technologies.annotation.constructor_injection.Employee;
import com.jsp.spring_core_technologies.annotation.setter_injection.Student;

public class CustomerDriver {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Customer customer=(Customer) context.getBean("mycustomer");
		System.out.println(customer);
		
		Student student= (Student) context.getBean("student");
		System.out.println(student);
		
		Employee emp=(Employee) context.getBean("employee");
		System.out.println(emp);
	}

}
