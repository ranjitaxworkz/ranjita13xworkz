package com.xworkz.xworkzapp.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class River_Add {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localHost:3306/river.db", "root", "root");		
	                                                                   //ABSTRACTION//
	     if(conn != null){
		  System.out.println("connected to db,can follow next steps");
				
	    Statement statement = conn.createStatement();  //ABSTRACTION//
		String sqlQuery = "ALTER TABLE river add R_ORIGIN VARCHAR(20)";
		int totalColumnUpdated = statement.executeUpdate(sqlQuery);
				
		System.out.println("totalColumnUpdated :" + totalColumnUpdated);
		conn.close();
		} 
			else{
				System.out.println("not connected");
			}
			
		}
	
}
