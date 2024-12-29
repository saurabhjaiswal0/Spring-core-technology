package com.jsp.spring_core_technologies.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//Base Package ke Information ko get Karne ke liye use karte hai .
@ComponentScan(basePackages="com.jsp.spring_core_technologies.annotation")
public class MyConfig {
	@Bean
	public int m1() {
		System.out.println("First Run");
		return 0;
		
	}

}
