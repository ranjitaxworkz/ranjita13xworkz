package com.xworkz.xworkzapp;

import java.util.Scanner;

import com.xworkz.xworkzapp.flight.FlightBooking;
import com.xworkz.xworkzapp.flight.FlightBookingDTO;


public class FlightBookingTester {

	private static String c;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		FlightBooking flight=new FlightBooking(size);
		for (int i = 0; i < size; i++) {
			
	    System.out.println("Enter the AiroplaneCode");
		String airoplaneCode=sc.next();
			
		System.out.println("enter the Company name ");
		String company=sc.next();
		
		System.out.println("enter the Starting point");
		String startingPoint=sc.next();
		
		System.out.println("enter the destination");
		String destination=sc.next();
		
		System.out.println("enter the TotalSeats");
		int totalSeats=sc.nextInt();
			
		System.out.println("Is flight domestic");
		boolean domestic=sc.nextBoolean();
		
	    System.out.println("enter the BusinessClassPrice");
		double businessClassPrice=sc.nextDouble();
			
		System.out.println("enter then EconomicClassPrice");
		double economicClassPrice=sc.nextDouble();
		
		FlightBookingDTO booking=new FlightBookingDTO();
		booking.setAiroplaneCode(airoplaneCode);
		booking.setCompany(com.xworkz.xworkzapp.constant.Constants.valueOf(company));
		booking.setStartingPoint(startingPoint);
		booking.setDestination(destination);
		booking.setTotalSeats(totalSeats);
		booking.setBusinessClassPrice(businessClassPrice);
		booking.setEconomicClassprice(economicClassPrice);
		booking.setDomestic(domestic);
			
	   flight.flightInformation(booking);
	   flight.acceptFlightBookingDetails(booking);
	}
		
		flight.getFlightBookingDetails();
		
		System.out.println("search starting point");
		String search=sc.next();
		flight.searchStartingPoint(search);
		

	
		}
	
	
	
	
}
