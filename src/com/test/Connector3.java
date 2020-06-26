package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector3 {
	public static void main(String[] args)	{
		
//		String jdbcDr = "org.mariadb.jdbc.Driver";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3306/java";
			String id = "root";
			String pw = "1234";
			Connection conn = DriverManager.getConnection(url,id,pw);
			Statement stmt = conn.createStatement();
			String sql = "select * from user";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())	{
				System.out.print(rs.getInt("num")+":");
				System.out.print(rs.getString("name") + ":");
				System.out.print(rs.getString("id")+ "\r");
			}
			
			sql = "INSERT INTO  user\r\n" + 
					"VALUES(4,'박박','MMT')";
			int result = stmt.executeUpdate(sql);
			System.out.print("실행결과 행 : " + result);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	} //main
}
