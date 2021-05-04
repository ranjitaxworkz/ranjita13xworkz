package com.xworkz.xworkzapp.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class River_Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localHost:3306/river.db", "root", "root");		
	                                                                   //ABSTRACTION//
	     if(conn != null){
		  System.out.println("connected to db,can follow next steps");
				
	    Statement statement = conn.createStatement();  //ABSTRACTION//
		String sqlQuery = "UPDATE river SET R_NAME = 'GANGA' WHERE R_ID = 1";
		int totalRowsUpdated = statement.executeUpdate(sqlQuery);
				
		System.out.println("totalRowsUpdated :" + totalRowsUpdated);
		conn.close();
		} 
			else{
				System.out.println("not connected");
			}
			
		}
	
	}
	
	

