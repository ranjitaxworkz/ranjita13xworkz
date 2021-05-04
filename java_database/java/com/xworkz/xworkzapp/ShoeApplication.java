package com.xworkz.xworkzapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShoeApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localHost:3306/shoe_db", "root", "root");
	  if(conn != null){
		  System.out.println("connected to database,follow the next steps");
		 Statement state = conn.createStatement();
		String sqlQuary = "INSERT INTO shoe values (2,'Max',1500,'Brown',8)";
		
		 int totalRows = state.executeUpdate(sqlQuary);
		 System.out.println("totalRows :" + totalRows);
	  } else {
		  System.out.println("not connected");
	  }
	
	
	
	}

}
