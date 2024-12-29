package com.jsp.spring_core_technologies.annotation.constructor_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Employee {
	private int id;
	private String name;
	public Employee(@Value(value="131")int id, @Value(value="Rajesh")String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
