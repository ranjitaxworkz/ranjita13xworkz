package com.xworkz.xworkzapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		String springxml = "spring.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(springxml);

		Supermarket supermarket = container.getBean(Supermarket.class);
		System.out.println(supermarket);

		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) container;
		classPathXmlApplicationContext.close();
	}

	// public static void main() {
	//
	// Worker worker = new Worker("ramu", 23, "male", 3465782345l);
	// Address address = new Address("xyz", 5, 123, 585102, "shahabazar");
	//
	// Supermarket supermarket = new Supermarket("more", 5, address, 2.5,
	// worker);
	// System.out.println(supermarket);
	// }
}