package com.jsp.spring_core_technologies.simple;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatteryDriver {
	public static void main(String[] args) {
		BeanFactory beanfactory=new ClassPathXmlApplicationContext("customer.xml");
		HP hp= (HP) beanfactory.getBean("hp");
		hp.serialNumber();
		hp.typeOfBattery();
		
		Lenevo lenevo=  (Lenevo) beanfactory.getBean("lenevo");
		lenevo.serialNumber();
		lenevo.typeOfBattery();
	}

}
