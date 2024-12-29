package com.jsp.spring_core_technologies.annotation.setter_injection;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;
@ToString
@Component
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String email;
	
	@Value(value="123")
	public void setId(int id) {
		this.id = id;
	}
	
	@Value(value="Raj")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value(value="raj@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}

	
	

}
