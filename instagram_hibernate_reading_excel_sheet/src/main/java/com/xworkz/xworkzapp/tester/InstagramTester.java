package com.xworkz.xworkzapp.tester;

import java.io.IOException;
import java.util.List;

import com.xworkz.xworkzapp.dao.InstagramDAO;
import com.xworkz.xworkzapp.dao.InstagramDAOImpl;
import com.xworkz.xworkzapp.dto.InstagramDTO;
import com.xworkz.xworkzapp.excel.ReadingFromExcel;
import com.xworkz.xworkzapp.service.InstagramService;
import com.xworkz.xworkzapp.service.InstagramServiceImpl;

public class InstagramTester {


	public static void main(String[] args) throws IOException {
		
		
		InstagramDTO dto = new InstagramDTO();
		
		
//		InstagramService serviceimpl = new InstagramServiceImpl();
		
		
		
		InstagramDAO  impl = new InstagramDAOImpl();
		
		ReadingFromExcel excel = new ReadingFromExcel();
		List<InstagramDTO> readFromExcel = excel.ReadFromExcel();
		for (InstagramDTO instagramDTO : readFromExcel) {
			System.out.println("instagramDTO====> "+instagramDTO);
			impl.saveInstaDTO(instagramDTO);
		}
				
		
		//serviceimpl.validateInstaData(dto);
	   // serviceimpl.validateGetInstaDetails();
		
		 //
		//impl.getInstaDetails();
		//impl.updateData();
		//impl.deletedata();
		
		//impl.loadAllInstagramUserRecords();
		//impl.getInstaUserNameById(4);
		//impl.getMaximumNoOfFollowers();
		//impl.getMinimumNoOfFollowers();
		//impl.getCountOfAllInstagramRecords();
//		impl.getSumOfAllUsersNoOfFollowers();
	}
}


