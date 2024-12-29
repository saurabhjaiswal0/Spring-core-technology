package com.jsp.spring_core_technologies.setter_injection;

import java.io.Serializable;

import lombok.Data;
@Data
public class Booking implements Serializable {
	private int orderId;
	private String productName;
	private String customerName;
	private int productQuantity;

}
