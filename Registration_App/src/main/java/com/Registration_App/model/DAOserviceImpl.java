package com.Registration_App.model;

import java.sql.*;

public class DAOserviceImpl implements DAOservice {
	
	private Connection con;
	private Statement stmnt;

	@Override
	public void connectDB() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_db","root","20092000");
			stmnt=con.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public boolean verify_login(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
			return result.next();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public void saveRegistration(String name, String email, String city, String mobile) {
		// TODO Auto-generated method stub
		try {
			stmnt.executeUpdate("insert into student_reg values('"+name+"','"+email+"','"+city+"','"+mobile+"')");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean emailexisted(String email) {
		// TODO Auto-generated method stub
		try {
			ResultSet result = stmnt.executeQuery("select * from student_reg where email='"+email+"'");

			return result.next();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false; 
		
	}

	@Override
	public ResultSet getAllRegistration() {
		try {
			ResultSet result = stmnt.executeQuery("select * from student_reg");

			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteByEmail(String email) {
		// TODO Auto-generated method stub
		try {
			stmnt.executeUpdate("delete from student_reg where email='"+email+"'");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void update_reg(String email, String mobile) {
		// TODO Auto-generated method stub
		try {
			stmnt.executeUpdate("UPDATE student_reg SET mobile='"+mobile+"' where email='"+email+"'");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	
		
	

}
