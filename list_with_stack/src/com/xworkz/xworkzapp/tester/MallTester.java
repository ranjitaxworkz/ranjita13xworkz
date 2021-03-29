package com.xworkz.xworkzapp.tester;

import java.util.LinkedList;

import com.xworkz.xworkzapp.dao.MallDao;
import com.xworkz.xworkzapp.dao.MallDaoImpl;
import com.xworkz.xworkzapp.dto.MallDto;

public class MallTester {

	public static void main(String[] args) {
		
		MallDto dto1=new MallDto("GarudaMall", "Ashoknagar", 123455, 30 );
		MallDto dto2=new MallDto("Westgate Value Mall","Manjunathnagar",578578, 40 );
	
		
		MallDao daoimpl=new MallDaoImpl();
		
		daoimpl.pushMallDetails(dto1);
		daoimpl.pushMallDetails(dto2);
		daoimpl.display();
		
		
		daoimpl.popMallDetails(dto2);
		daoimpl.display();
		
		LinkedList<String> list=new LinkedList<String>();
		
		   list.add("OrionMall");
		   list.add("GT World Mall");
		   list.add("MantriMall");
		   list.add("Royal Meenakshi");
		   System.out.println(list);
		   
		   String peek=list.peekLast();
		   System.out.println(peek);
		   
           String peek1=list.peekFirst();
		   System.out.println(peek1);
		   
		   String pool=list.pollLast();
		   System.out.println(pool);
		   
		   String pool1=list.pollFirst();
		   System.out.println(pool1);
		   
		
		   
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
