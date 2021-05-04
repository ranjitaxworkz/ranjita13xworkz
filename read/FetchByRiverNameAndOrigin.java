package com.xworkz.xworkzapp.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchByRiverNameAndOrigin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String URL = "jdbc:mysql://localHost:3306/river.db";
		String USERNAME = "root";
		String PASSWORD = "root";
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		Statement statement = conn.createStatement();
		
		String sql = "select * from river WHERE R_NAME='YAMUNA' and R_ORIGIN='YAMUNOTRI'";
		ResultSet result = statement.executeQuery(sql);
		System.out.println(result);
		result.next();  //moves the cursor
		
		int id=result.getInt(1);  //column value by index,index starts from 1
		System.out.println("id :" + id);
		
		String name=result.getString(2);
		System.out.println("name :" + name);
		
		double length=result.getDouble(3);
		System.out.println("length :" + length);
		
		boolean polluted=result.getBoolean(4);
		System.out.println("polluted :" + polluted);
		
		String origin=result.getString(5);
		System.out.println("origin :" + origin);
		
		conn.close();
		
		
	}
}
