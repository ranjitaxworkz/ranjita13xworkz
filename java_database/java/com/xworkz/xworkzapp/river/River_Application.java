package com.xworkz.xworkzapp.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class River_Application {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
	  //com.mysql.cj.jdbc.Driver=version is 8
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	 //jdbc:mysql://localhost:3306/river.db
     Connection conn = DriverManager.getConnection("jdbc:mysql://localHost:3306/river.db", "root", "root");		
                                                                   //ABSTRACTION//
     if(conn != null){
			System.out.println("connected to db,can follow next steps");
			
			Statement statement = conn.createStatement();  //ABSTRACTION//
			String sqlQuery = "INSERT INTO river VALUES (1,'KAVERI',805,0,'TALAKAVERI'),(2,'YAMUNA',788,0,'UTTARAKHAND'),(3,'GODHAVARI',605,0,'TRIMBAKESHWAR'),(4,'KRISHNA',597,0,'MAHABALESHWAR'),(5,'TUNGABHASRA',890,0,'HAMPI')";
			int totalRowsAffected = statement.executeUpdate(sqlQuery);
			
			System.out.println("totalRowsAffected :" + totalRowsAffected);
		} 
		else{
			System.out.println("not connected");
		}
		
	}
	
	
}
