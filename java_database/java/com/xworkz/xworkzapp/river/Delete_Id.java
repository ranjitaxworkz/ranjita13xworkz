package com.xworkz.xworkzapp.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_Id {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localHost:3306/river.db", "root", "root");		
	                                                                   //ABSTRACTION//
	     if(conn != null){
				
	    Statement statement = conn.createStatement();  //ABSTRACTION//
		String sqlQuery = "DELETE FROM river WHERE R_ID=5";

		int totalRowsUpdated = statement.executeUpdate(sqlQuery);
				
		System.out.println("totalRowsUpdated :" + totalRowsUpdated);
		conn.close();
		} 
			else{
				System.out.println("not connected");
			}
			
		}
	
	}
	
	



