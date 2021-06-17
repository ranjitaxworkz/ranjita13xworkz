package com.xworkz.xworkzapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Worker {
	
	@Value("ravi")
	private String name;
	@Value("23")
	private int age;
	@Value("male")
	private String gender;
	@Value("2345678732")
	private long phoneNo;

	public Worker(String name, int age, String gender, long phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNo = phoneNo;
		System.out.println(this.getClass().getSimpleName() + "object created");

	}

	public Worker() {
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", gender=" + gender + ", phoneNo=" + phoneNo + "]";
	}

}
