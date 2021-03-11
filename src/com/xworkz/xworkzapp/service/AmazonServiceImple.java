package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.AmazonDao;
import com.xworkz.xworkzapp.dao.AmazonDaoImple;
import com.xworkz.xworkzapp.dto.AmazonDTO;

public class AmazonServiceImple implements AmazonService {

	AmazonDao daoimpl = new AmazonDaoImple();
	
	

	@Override
	public void loginId(String usern, String pass) {
		if (usern != null && usern.contains("@") && usern.contains(".com") && pass.length() > 6 ){
			daoimpl.loginId(usern, pass);
			//System.out.println("Login Successfull...");
		}else{
			System.out.println("Please Enter Valid Cridentails ");
		}
	}

	@Override
	public void addMovies(AmazonDTO Moviename) {
		if (Moviename != null) {
			daoimpl.addMovies(Moviename);
			System.out.println("adding movies ...service imple");
		} else {
			System.out.println(" invalid movie name ");
		}

	}

	@Override
	public void displayMovieDetails() {
		System.out.println("Display MOvie Details ....");
		daoimpl.displayMovieDetails();

	}

	@Override
	public void subscribers() {
		System.out.println("Subcriber Viewers list");
		daoimpl.viewSubscriber(null);
		
		
		
	}
	public void  viewDate(){
		daoimpl.displayDate();
	}

}
