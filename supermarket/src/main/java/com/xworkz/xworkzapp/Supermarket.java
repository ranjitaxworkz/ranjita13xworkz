package com.xworkz.xworkzapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Supermarket {

	@Value("more")
	private String name;
	@Value("4")
	private int noOfCounters;
	@Autowired
	private Address address;
	@Value("2.5")
	private double gst;
	@Autowired
	private Worker worker;

	public Supermarket(String name, int noOfCounters, Address address, double gst, Worker worker) {
		super();
		this.name = name;
		this.noOfCounters = noOfCounters;
		this.address = address;
		this.gst = gst;
		this.worker = worker;
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	public Supermarket() {
		System.out.println(this.getClass().getSimpleName() + "object created");

	}

	@Override
	public String toString() {
		return "Supermarket [name=" + name + ", noOfCounters=" + noOfCounters + ", address=" + address + ", gst=" + gst
				+ ", worker=" + worker + "]";
	}

}
