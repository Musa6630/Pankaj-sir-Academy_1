package app_jdbc_programs;

import java.sql.*;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Connection con=null;
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name");
			String name=sc.next();
			
			System.out.println("Enter your city");
			String city=sc.next();
			
			System.out.println("Enter your email");
			String email=sc.next();
			
			System.out.println("Enter your mobile no");
			String mobile=sc.next();
			
			
			//Step Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_connection_1", "root", "20092000");
			System.out.println(con);
			
			//Step 2: Execute SQL Queries
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			
			//Step 3: Close Connection
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { 
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
