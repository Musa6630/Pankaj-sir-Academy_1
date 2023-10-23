package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class NewRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewRegistration() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("firstName");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobileNo");
//		System.out.println(name);
//		System.out.println(city);
//		System.out.println(email);
//		System.out.println(mobile);
//		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_db1", "root", "20092000");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into registration_form values('" + name + "','" + city + "','" + email + "','"
					+ mobile + "')");
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
