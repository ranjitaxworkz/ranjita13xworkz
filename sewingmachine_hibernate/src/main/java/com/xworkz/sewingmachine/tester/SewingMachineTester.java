package com.xworkz.sewingmachine.tester;

import com.xworkz.sewingmachine.dao.SewingMachineDAO;
import com.xworkz.sewingmachine.dao.SewingMachineDAOImpl;
import com.xworkz.sewingmachine.dto.SewingMachineDTO;
import com.xworkz.sewingmachine.service.SewingMachineService;
import com.xworkz.sewingmachine.service.SewingMachineServiceImpl;

public class SewingMachineTester {

	public static void main(String[] args) {
		
		
    SewingMachineDTO dto = new SewingMachineDTO("Bernina", "BA57", 1400, "Blue", true);
			
    SewingMachineService serviceImpl = new  SewingMachineServiceImpl();
	
	SewingMachineDAO dao = new SewingMachineDAOImpl();
	
	//dao.saveSewingMachinedetails(dto);
	//dao.fetchSewingMachineDetails();
	//dao.updateSewingMachineDetails();
	//dao.deleteSewingMachineDetails();
	
	//dao.loadAllSewingMachineRecords();
	//dao.getMaxPriceOfSewingMachine();
	//dao.getminPriceOfSewingMachine();
	//dao.getAvgPriceOfSewingMachine();
	dao.getSumOfAllSewingMachinePrice();
}
}