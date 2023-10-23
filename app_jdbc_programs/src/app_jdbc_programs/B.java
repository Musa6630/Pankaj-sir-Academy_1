package app_jdbc_programs;

import java.sql.*;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name");
			String name=sc.next();
			
			System.out.println("Enter your mobile");
			String mobile=sc.next();
			//Step Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_connection_1", "root", "20092000");
			System.out.println(con);
			
			//Step 2: Execute SQL Queries
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("delete from registration where name='"+name+"' or mobile='"+mobile+"'");
			
			//Step 3: Close Connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		
	}
}
