package com.xworkz.xworkzapp.flight;

import com.xworkz.xworkzapp.constant.Constants;

public class FlightBookingDTO {

	private String airoplaneCode;
	private Constants company;
	private String startingPoint;
	private String destination;
	private int totalSeats;
	private boolean domestic;
	private double businessClassPrice;
	private double economicClassprice;
	
	public String getAiroplaneCode() {
		return airoplaneCode;
	}
	public void setAiroplaneCode(String airoplaneCode) {
		this.airoplaneCode = airoplaneCode;
	}
	public Constants getCompany() {
		return company;
	}
	public void setCompany(Constants company) {
		this.company = company;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public boolean getDomestic() {
		return domestic;
	}
	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}
	public double getBusinessClassPrice() {
		return businessClassPrice;
	}
	public void setBusinessClassPrice(double businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}
	public double getEconomicClassprice() {
		return economicClassprice;
	}
	public void setEconomicClassprice(double economicClassprice) {
		this.economicClassprice = economicClassprice;
	}
	
}
