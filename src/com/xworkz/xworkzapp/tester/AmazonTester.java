package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.dto.AmazonDTO;
import com.xworkz.xworkzapp.service.AmazonService;
import com.xworkz.xworkzapp.service.AmazonServiceImple;

public class AmazonTester {
	
	public static void main(String[] args) {
		
		AmazonDTO amazonDTO= new AmazonDTO("amazon@123.com", "amazon123", "Robert", "500Mb", "Darshan", "AshaBhatt");
		
		AmazonServiceImple amazon = new AmazonServiceImple();
		
		
		
		amazon.addMovies(amazonDTO);
		
		amazon.loginId("amazon@123.com", "amazon123");
		amazon.displayMovieDetails();
		
		amazon.subscribers();
		
		amazon.viewDate();
	
	}

}
