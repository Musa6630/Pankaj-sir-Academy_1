package app_jdbc_programs;

import java.sql.*;

public class D {

	public static void main(String[] args) {
		
		try {
			//Step Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_connection_1", "root", "20092000");
			System.out.println(con);
			
			//Step 2: Execute SQL Queries
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("SELECT * from registration");
			
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
			}
			//Step 3: Close Connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		

		
		
	}
}
