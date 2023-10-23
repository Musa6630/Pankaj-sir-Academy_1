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


@WebServlet("/delete_reg")
public class Delete_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Delete_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		DAOservice service = new DAOserviceImpl();
		service.connectDB();
		service.deleteByEmail(email);
		ResultSet result=service.getAllRegistration();
		request.setAttribute("res", result);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/show_reg.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
