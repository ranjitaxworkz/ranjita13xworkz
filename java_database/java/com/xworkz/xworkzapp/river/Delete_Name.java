package com.xworkz.xworkzapp.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_Name {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localHost:3306/river.db", "root", "root");		
	                                                                   
	     if(conn != null){
				
	    Statement statement = conn.createStatement();  
		String Query = "DELETE FROM river WHERE R_NAME='GODHAVARI'";

		int totalRowsUpdated = statement.executeUpdate(Query);
				
		System.out.println("totalRowsUpdated :" + totalRowsUpdated);
		conn.close();
		} 
			else{
				System.out.println("not connected");
			}
			
		}
	
}
