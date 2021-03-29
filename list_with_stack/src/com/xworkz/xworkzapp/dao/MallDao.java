package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.MallDto;

public interface MallDao {

	public void pushMallDetails(MallDto dto);
	
	public void popMallDetails(MallDto dto);
	
	public void display();
	
	
	
}
