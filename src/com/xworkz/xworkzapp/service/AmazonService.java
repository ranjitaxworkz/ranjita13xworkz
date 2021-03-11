package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.AmazonDTO;

public interface AmazonService {

	public void loginId(String username, String password);

	public void addMovies(AmazonDTO amazonDTO);

	public void displayMovieDetails();
	
	public void subscribers();

}
