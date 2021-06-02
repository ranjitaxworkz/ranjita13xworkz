package com.xworkz.sewingmachine.dao;

import com.xworkz.sewingmachine.dto.SewingMachineDTO;

public interface SewingMachineDAO {

    public void saveSewingMachinedetails(SewingMachineDTO dto);
	public void fetchSewingMachineDetails();
	public void updateSewingMachineDetails();
	public void deleteSewingMachineDetails();
	
	public void loadAllSewingMachineRecords();
	public void getMaxPriceOfSewingMachine();
	public void getminPriceOfSewingMachine();
	public void getAvgPriceOfSewingMachine();
	public void getSumOfAllSewingMachinePrice();

	


}
