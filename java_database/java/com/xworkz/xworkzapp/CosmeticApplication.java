package com.xworkz.xworkzapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CosmeticApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cosmetic_db", "root", "root");
		if(conn != null){
			System.out.println("Connected to database");
		} else {
			System.out.println("not connecetd to database");
		}
		Statement statement = conn.createStatement();
		String sql = "INSERT INTO cosmetic VALUES (1,'Loreal',2500,'female','Lotions')";
	  int totalRows = statement.executeUpdate(sql);
	  System.out.println("totalRows :" + totalRows);
	}
}
