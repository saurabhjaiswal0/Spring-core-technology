package com.jsp.spring_core_technologies.simple;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDriver {
	
   public static void main(String[] args) {
//	   This is a pojo class //  a encapsulation // a entity // 
	  BeanFactory beanfactory=new ClassPathXmlApplicationContext("customer.xml");
	  
//	  getBean is coming for beanfactory
	  Customer customer=(Customer) beanfactory.getBean("customer");
	  
	  customer.getData();
	  
}

}
