package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.InstagramDAO;
import com.xworkz.xworkzapp.dao.InstagramDAOImpl;
import com.xworkz.xworkzapp.dto.InstagramDTO;

public class InstaSeviceImpl  implements InstaService{

	
	InstagramDAO daoimpl = new InstagramDAOImpl();

	public void validateInstaData(InstagramDTO dto) {
		  System.out.println("Inside Service La");
			Boolean flag = true;
			
			if(dto.getUserName() == null || dto.getUserName().length() < 8) {
				System.out.println("Invalid userName");
				flag = false;
			}
			
			if(dto.getPassword() == null || dto.getPassword().length() < 8) {
				System.out.println("Invalid password");
				flag = false;
			}
			
			if(dto.getNoOfFollowers() == 0 || dto.getNoOfFollowers() < 500) {
				System.out.println("Invalid number of followers");
				flag = false;
			}
			
			if(dto.getType() == null || dto.getType().length() < 10) {
				System.out.println("Invalid type");
				flag = false;
			}
			
			if (flag) {
				daoimpl.saveInstaDTO(dto);
				System.out.println(" Data added successfully");
			}
			
		}
	
		public void validateGetInstaDetails() {
			
			daoimpl.getInstaDetails();
			System.out.println("Get all data from database");
		}		
	}


	
	
	
	
	


