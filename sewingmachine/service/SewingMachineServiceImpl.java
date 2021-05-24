package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.SewingMachineDAO;
import com.xworkz.xworkzapp.dao.SewingMachineDAOImpl;
import com.xworkz.xworkzapp.dto.SewingMachineDTO;

public class SewingMachineServiceImpl implements SewingMachineService {

	SewingMachineDAO dao = new SewingMachineDAOImpl();

	@Override
	public void validateSewingMachineDTO(SewingMachineDTO dto) {
		
		Boolean flag = true;

		if (dto.getName() == null || dto.getName().length() < 2) {
			System.out.println("Invalid SewingMachine Name");
			flag = false;
		}

		if (dto.getModel() == null || dto.getModel().length() < 2) {
			System.out.println("Invalid SewingMachine Model");
			flag = false;
		}

		if (dto.getPrice() == 0 || dto.getPrice() < 999) {
			System.out.println("Invalid SewingMachine Price");
			flag = false;
		}

		if (dto.getColor() == null || dto.getColor().length() < 2) {
			System.out.println("Invalid SewingMachine length");
			flag = false;
		}
		
		if (flag) {
			dao.saveSewingMachinedetails(dto);
			System.out.println("Details are added Successfully");
			//System.out.println(flag);
		}

	}
	

	@Override
	public void validateSewingMachineDetails() {
		
		dao.fetchSewingMachineDetails();
		System.out.println("Fetched Sewing Machine Details From Database");
	}

}
