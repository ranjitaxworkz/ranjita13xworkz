package com.xworkz.xworkzapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChocolateTester {

	public static void main(String[] args) {

		String springxml = "spring.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(springxml);
		Chocolate chocolate = container.getBean(Chocolate.class);
		System.out.println(chocolate);

		// Integer integer = container.getBean(Integer.class);
		// System.out.println(integer);
		chocolate.taste();

	}

}
