package com.xworkz.xworkzapp.dao;

import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.xworkzapp.dto.MallDto;

public class MallDaoImpl implements MallDao {
	
	LinkedList<MallDto> list=new LinkedList<MallDto>();

	@Override
	public void pushMallDetails(MallDto dto) {
		list.push(dto);
		System.out.println("Mall Details added successfully");
		
	}

	@Override
	public void popMallDetails(MallDto dto) {
		list.pop();
		System.out.println("Mall details removed successfully");
		
	}

	@Override
	public void display() {
		Iterator<MallDto> iterator=list.iterator();
		
		while (iterator.hasNext()) {
			
			MallDto mall=(MallDto)iterator.next();
			
			System.out.println("***************************************************");
			
			System.out.println("Mall name           :" + mall.getName());
			System.out.println("Mall location       :" + mall.getLocation());
			System.out.println("Mall licence number :" + mall.getLicenceNo());
			System.out.println("Mall noOfEmployees  :" +mall.getNoOfEmployees());
			
			System.out.println("***************************************************");
		}
		
	}

	
	
	
}
