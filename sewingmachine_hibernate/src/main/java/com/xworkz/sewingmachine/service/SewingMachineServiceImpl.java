package com.xworkz.sewingmachine.service;

import com.xworkz.sewingmachine.dao.SewingMachineDAO;
import com.xworkz.sewingmachine.dao.SewingMachineDAOImpl;
import com.xworkz.sewingmachine.dto.SewingMachineDTO;

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
		}

	}
	

	@Override
	public void validateSewingMachineDetails() {
		dao.fetchSewingMachineDetails();
		System.out.println("Fetch Sewing Machine Details From Database");
	}


	@Override
	public void validateUpdateSewingMachineDetails() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteSewingMachineDetails() {
		// TODO Auto-generated method stub
		
	}

}
