package s0626;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest {

	public static void main(String[] args) {
		List<Car> carList = new ArrayList<>(); // List 인터페이스 메모리 생성불가

//		Car c = null;
//		c.setName("쏘렌토"); // 메모리없음, 입력불가

		String str = "기아,쏘나타,검정,2000";
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 1; i++) {
			System.out.println("자동차 정보를 ,를 기준으로 입력해주세요 ex) 브랜드,차종,색상,배기량: >");
			String[] infos = s.nextLine().split(",");

			Car c = new Car();
			c.setName(infos[0]);
			c.setCarMaker(infos[1]);
			c.setColor(infos[2]);
			c.setCc(Integer.parseInt(infos[3]));
			carList.add(c);

		}

//		System.out.println(carList);

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3306/java";
			String id = "root";
			String pw = "1234";
			Connection conn = DriverManager.getConnection(url, id, pw);
			Statement stmt = conn.createStatement();
			for (int i = 0; i < carList.size(); i++) {

				Car c = carList.get(i);
				String sql = " insert into car(Name,carmaker,color,cc) "; // 명령문 한칸 띄기 (쿼리 창에서 입력되는 명령문으로 띄어쓰기 또는 \r\n																	// \n입력)
				sql += "values('" + c.getName() + "',";
				sql += "'" +c.getCarMaker() + "',";
				sql += "'" +c.getColor() + "',";
				sql +=  + c.getCc() + ")";
				int result =stmt.executeUpdate(sql);
				System.out.println(sql);
				
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	} // main

}
