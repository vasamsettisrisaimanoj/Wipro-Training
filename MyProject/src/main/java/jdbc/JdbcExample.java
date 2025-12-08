package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Manoj@9550");
			System.out.println(con.toString());
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
