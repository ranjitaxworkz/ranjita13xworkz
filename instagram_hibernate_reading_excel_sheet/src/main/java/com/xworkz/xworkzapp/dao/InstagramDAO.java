
package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.InstagramDTO;

public interface InstagramDAO {

		public void saveInstaDTO(InstagramDTO dto);
		public void getInstaDetails();
		public void updateData();
		public void deletedata();
		
	    public void loadAllInstagramUserRecords();
		public void getInstaUserNameById(int id);
		public void getMaximumNoOfFollowers();
		public void getMinimumNoOfFollowers();
		public void getCountOfAllInstagramRecords();
		public void getSumOfAllUsersNoOfFollowers();

		
		
		
	}


