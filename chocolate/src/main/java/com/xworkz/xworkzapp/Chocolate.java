package com.xworkz.xworkzapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chocolate {
	
	@Value("dairymilk")
	private String name;
	@Value("small")
	private String size;
	@Value("20.0")
	private double price;
	@Value("cadbury")
	private String brand;

	public Chocolate() {
		System.out.println(this.getClass().getSimpleName() + " object created");

	}

	public Chocolate(String name, String size, double price, String brand) {
		System.out.println("parameterized constructor");

		this.name = name;
		this.size = size;
		this.price = price;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void taste() {
		System.out.println("chocolate is very tastey");
	}

	@Override
	public String toString() {
		return "Chocolate [name=" + name + ", size=" + size + ", price=" + price + ", brand=" + brand + "]";
	}

}
