package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.SewingMachineDTO;

public interface SewingMachineDAO {

    public void saveSewingMachinedetails(SewingMachineDTO dto);
	
	public void fetchSewingMachineDetails();
}
