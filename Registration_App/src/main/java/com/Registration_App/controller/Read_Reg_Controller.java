package com.Registration_App.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Registration_App.model.DAOservice;
import com.Registration_App.model.DAOserviceImpl;

@WebServlet("/all_reg")
public class Read_Reg_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Read_Reg_Controller() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		session.setMaxInactiveInterval(10);
		if (session.getAttribute("email") != null) {
		
		DAOservice service = new DAOserviceImpl();
		service.connectDB();
		ResultSet result=service.getAllRegistration();
		request.setAttribute("res", result);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/show_reg.jsp");
		rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
