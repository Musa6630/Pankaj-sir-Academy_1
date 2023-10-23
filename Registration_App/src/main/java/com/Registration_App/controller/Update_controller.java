package com.Registration_App.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Registration_App.model.DAOservice;
import com.Registration_App.model.DAOserviceImpl;

@WebServlet("/update_reg")
public class Update_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Update_controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		request.setAttribute("email", email);
		request.setAttribute("mobile", mobile);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/update_registration.jsp");
		rd.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		DAOservice service=new DAOserviceImpl();
		service.connectDB();
		service.update_reg(email, mobile);
		
		ResultSet result=service.getAllRegistration();
		request.setAttribute("res", result);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/show_reg.jsp");
		rd.forward(request, response);

	}

}
