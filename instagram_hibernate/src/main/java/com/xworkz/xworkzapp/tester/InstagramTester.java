package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.dao.InstagramDAO;
import com.xworkz.xworkzapp.dao.InstagramDAOImpl;
import com.xworkz.xworkzapp.dto.InstagramDTO;
import com.xworkz.xworkzapp.service.InstagramService;
import com.xworkz.xworkzapp.service.InstagramServiceImpl;

public class InstagramTester {


	public static void main(String[] args) {
		
		
		InstagramDTO dto = new InstagramDTO("kavya", "k675", "private", true, 200);
		
		InstagramService serviceimpl = new InstagramServiceImpl();
		
		InstagramDAO  impl = new InstagramDAOImpl();
		
		//serviceimpl.validateInstaData(dto);
	   // serviceimpl.validateGetInstaDetails();
		
		 //impl.saveInstaDTO(dto);
		//impl.getInstaDetails();
		//impl.updateData();
		//impl.deletedata();
		
		//impl.loadAllInstagramUserRecords();
		//impl.getInstaUserNameById(4);
		//impl.getMaximumNoOfFollowers();
		//impl.getMinimumNoOfFollowers();
		//impl.getCountOfAllInstagramRecords();
		impl.getSumOfAllUsersNoOfFollowers();
	}
}


