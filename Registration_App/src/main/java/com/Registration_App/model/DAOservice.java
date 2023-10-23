package com.Registration_App.model;

import java.sql.ResultSet;

public interface DAOservice {
	
	public void connectDB();
	
	
	public boolean verify_login(String email, String password);
	public void saveRegistration(String name, String email, String city,String mobile);
	public boolean emailexisted(String email);
	
	public ResultSet getAllRegistration();


	public void deleteByEmail(String email);


	public void update_reg(String email, String mobile);


	
	
	
}
