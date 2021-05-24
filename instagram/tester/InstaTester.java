package com.xworkz.xworkzapp.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.xworkzapp.dao.InstagramDAO;
import com.xworkz.xworkzapp.dao.InstagramDAOImpl;
import com.xworkz.xworkzapp.dto.InstagramDTO;
import com.xworkz.xworkzapp.service.InstaService;
import com.xworkz.xworkzapp.service.InstaSeviceImpl;

public class InstaTester {

	public static void main(String[] args) {
		
		
		InstagramDTO dto = new InstagramDTO("rani", "rani475", "public", true, 370);
		
		InstaService serviceimpl = new InstaSeviceImpl();
		
		InstagramDAO  daoimpl = new InstagramDAOImpl();
		
		serviceimpl.validateInstaData(dto);
	    serviceimpl.validateGetInstaDetails();
			
		
		
		
		
	}
}
