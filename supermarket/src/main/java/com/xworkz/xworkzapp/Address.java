package com.xworkz.xworkzapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("xyz")
	private String street;
	@Value("4")
	private int buildingNo;
	@Value("545")
	private int doorNo;
	@Value("585102")
	private int pinCode;
	@Value("shahabazar")
	private String area;

	public Address(String street, int buildingNo, int doorNo, int pinCode, String area) {
		super();
		this.street = street;
		this.buildingNo = buildingNo;
		this.doorNo = doorNo;
		this.pinCode = pinCode;
		this.area = area;
		System.out.println(this.getClass().getSimpleName() + "object created");

	}
	
	public Address() {
		System.out.println(this.getClass().getSimpleName() + "object created");

	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", buildingNo=" + buildingNo + ", doorNo=" + doorNo + ", pinCode="
				+ pinCode + ", area=" + area + "]";
	}

}
