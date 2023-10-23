package l1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Update_Student")
public class Update_Student extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Update_Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
//		String name = request.getParameter("name");
//		String city = request.getParameter("city");
		String updated_email = request.getParameter("updated_email");
		String updated_name = request.getParameter("updated_name");
		String updated_city = request.getParameter("updated_city");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_db2", "root", "20092000");
			Statement stmnt = con.createStatement();
			String query = "UPDATE student_detail SET email='" + updated_email + "', name='" + updated_name
					+ "', city='" + updated_city + "' WHERE email='" + email + "'";
			stmnt.executeUpdate(query);

			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
