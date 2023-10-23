package v1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Verifylogin")
public class Verifylogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Verifylogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_db2", "root", "20092000");
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
//			System.out.println(result.next());
			
			if (result.next()) {
				System.out.println("welcome in login");
			} else {
				System.out.println("invalid Username/Password");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
