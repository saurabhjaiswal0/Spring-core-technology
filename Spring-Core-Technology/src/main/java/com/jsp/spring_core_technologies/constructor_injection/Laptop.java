package com.jsp.spring_core_technologies.constructor_injection;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Laptop implements Serializable {
	private int laptopId;
	private String laptopName;
	private String laptopColor;
	private double laptopPrice;

}
