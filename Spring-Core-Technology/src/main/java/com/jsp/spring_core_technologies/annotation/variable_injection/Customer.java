package com.jsp.spring_core_technologies.annotation.variable_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;
@Getter
@ToString
//@Component==>ise tab use karte hai jab hamare pass keval ek hee class ho jisse data access karna ho to ise hee use karenge
@Component(value="mycustomer")// ise tab use karte hai jab hamare same class name ek se jyada ho to 
public class Customer {
	
//	Using of the Annotation of @Value Springframework for value inserting
	
	@Value(value="1234")
	private int id;
	@Value(value="Saurabh")
	private String name;
	@Value(value="sk@gmail.com")
	private String email;

}
