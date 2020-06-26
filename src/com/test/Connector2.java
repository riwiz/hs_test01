package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector2 {
	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver"); // 1 예외 처리 해야함 반듯이
			String url = "jdbc:mariadb://127.0.0.1:3306/java";
			String id = "root";
			String pwd = "1234";
			Connection conn = DriverManager.getConnection(url, id, pwd); // 입력된 변수가 틀렸을 경우의 예외처리해야함
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print(rs.getInt("num") + ",");
				System.out.print(rs.getString("name") + ",");
				System.out.print(rs.getString("id") + "\r");

			}

			sql = "INSERT INTO  user\r\n" + "VALUES(4,'박박','MMT')";
			int result = stmt.executeUpdate(sql);
			System.out.print("실행 결과 반영개수" + result);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
		
	}
}
