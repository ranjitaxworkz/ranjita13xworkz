package com.xworkz.xworkzapp.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetOriginColumn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String URL = "jdbc:mysql://localHost:3306/river.db";
		String USERNAME = "root";
		String PASSWORD = "root";
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		Statement statement = conn.createStatement();
		
		String sql = "select R_ORIGIN from river WHERE R_NAME='KRISHNA' AND R_ORIGIN='MAHABALESHWAR'";
		ResultSet result = statement.executeQuery(sql);
		System.out.println(result);
		result.next();  //moves the cursor
		
	    //column value by index,index starts from 1
		String origin=result.getString(1);
		System.out.println("origin :" + origin);
		
		conn.close();
		
		
	}
}
