package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.dto.SewingMachineDTO;
import com.xworkz.xworkzapp.service.SewingMachineService;
import com.xworkz.xworkzapp.service.SewingMachineServiceImpl;

public class SewingMachineTester {

	public static void main(String[] args) {
		
		
    SewingMachineDTO dto = new SewingMachineDTO(2,"G-Movers", "G-7587",1000, "Black", true);
			
	SewingMachineService serviceImpl = new  SewingMachineServiceImpl();
	
		//serviceImpl.validateSewingMachineDTO(dto);
		
		serviceImpl.validateSewingMachineDetails();
}
}