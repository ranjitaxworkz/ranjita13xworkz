package com.xworkz.xworkzapp.dto;

public class MallDto {

	private String name;
	private String location;
	private int licenceNo;
	private int noOfEmployees;
	
	public MallDto(String name, String location, int licenceNo, int noOfEmployees) {
		
		this.name = name;
		this.location = location;
		this.licenceNo = licenceNo;
		this.noOfEmployees = noOfEmployees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(int licenceNo) {
		this.licenceNo = licenceNo;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	
	
	
	
}
