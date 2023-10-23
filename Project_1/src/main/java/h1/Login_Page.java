package h1;

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

@WebServlet("/Login_Page")
public class Login_Page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Login_Page() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup_db", "root", "20092000");
			Statement stmnt = con.createStatement();
			
			ResultSet res = stmnt.executeQuery("select * from signup_detail where email='"+email+"' and password='"+password+"'");
			
			if(res.next()) {
				System.out.println("welcome");
			}
			
			else {
				System.out.println("Invalid details");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
