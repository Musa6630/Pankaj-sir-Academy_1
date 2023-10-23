package com.Registration_App.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.Registration_App.StudentModel.student_serviceImpl;
import com.Registration_App.model.DAOservice;
import com.Registration_App.model.DAOserviceImpl;

@WebServlet("/SaveStudent")
public class studentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public studentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/NewReg.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		session.setMaxInactiveInterval(10);
		if (session.getAttribute("email") != null) {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String city = request.getParameter("city");
			String mobile = request.getParameter("mobile");

			DAOservice service = new DAOserviceImpl();
			service.connectDB();
			boolean status = service.emailexisted(email);
			if (status) {
				request.setAttribute("msg", "email id already exist");

			} else {
				service.saveRegistration(name, email, city, mobile);
				request.setAttribute("msg", "Record is saved");
			}

			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/NewReg.jsp");
			rd.forward(request, response);

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

}
