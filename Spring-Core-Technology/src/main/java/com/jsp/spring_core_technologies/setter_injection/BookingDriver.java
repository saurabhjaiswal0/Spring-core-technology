package com.jsp.spring_core_technologies.setter_injection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookingDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("dependency_injection.xml");
		Booking booking=(Booking) context.getBean("booking");
		System.out.println(booking);
	}

}
