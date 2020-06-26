package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3306/java";
			String id = "root";
			String pwd = "1234";
			Connection conn = DriverManager.getConnection(url, id, pwd); // Connevtion - 반드시 끊어줘야 함 finnally
			Statement stmt = conn.createStatement(); // sql 실행창 생성 - 반드시 생성된 conn(변수명)으로 연결해야함
			String sql = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print(rs.getInt("num") + ",");
				System.out.print(rs.getString("name") + ",");
				System.out.print(rs.getString("id"));
				System.out.println();
				
			}
			
			sql ="INSERT INTO  user\r\n" + 
					"VALUES(3,'이름','NAME')";
			int result = stmt.executeUpdate(sql);
			System.out.println("니 실행결과 반영갯수 :" + result);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
