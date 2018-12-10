package squirrel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/sakila";

	static final String USER = "root";
	static final String PASS = "Defiler1522";

	public static void accessDB() {
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql2 = "SELECT actor_id, first_name, last_name FROM actor WHERE first_name = 'ZERO'";
			ResultSet rs = stmt.executeQuery(sql2);
			while (rs.next()) {
			  int id = rs.getInt("actor_id");
			  String FirstName = rs.getString("first_name");
			  String LastName = rs.getString("last_name");
			  System.out.println("Actor_ID: " + id + ", First_name: " + FirstName + ", Last_name: " + LastName);
			  }
			rs.close();


		} catch (ClassNotFoundException exception) {
			exception.printStackTrace();
		} catch (SQLException exception) {
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			System.out.println("Goodbye!");
		}

	}
}
