package com.xworkz.xworkzapp.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOriginAndPolluted {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localHost:3306/river.db", "root", "root");		
	                                                                   //ABSTRACTION//
	     if(conn != null){
		  
				
	    Statement statement = conn.createStatement();  //ABSTRACTION//
		String sqlQuery = "UPDATE river SET R_ORIGIN ='YAMUNOTRI' , R_POLLUTED = 1,R_LENGTH = 1376 WHERE R_NAME = 'YAMUNA'";
		int totalRowsUpdated = statement.executeUpdate(sqlQuery);
				
		System.out.println("totalRowsUpdated :" + totalRowsUpdated);
		conn.close();
		} 
			else{
				System.out.println("not connected");
			}
			
		}
	
	}
	
	



