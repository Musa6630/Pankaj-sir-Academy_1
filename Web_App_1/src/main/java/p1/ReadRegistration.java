package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ShowData")
public class ReadRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ReadRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.print("<table border='2'>");
		out.print("<tr>");
		
		out.print("<th margin-left='10%'>");
		out.print("Name");
		out.print("</th>");
		
		out.print("<th>");
		out.print("City");
		out.print("</th>");
		
		out.print("<th>");
		out.print("Email");
		out.print("</th>");
		
		out.print("<th>");
		out.print("Mobile");
		out.print("</th>");
		
		out.print("</tr>");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_db1", "root", "20092000");
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from registration_form");
			while(result.next()) {
				out.print("<tr>");
				
				out.print("<td >");
				out.print(result.getString(1));
				out.print("</td>");
				
				out.print("<td >");
				out.print(result.getString(2));
				out.print("</td>");
				
				out.print("<td >");
				out.print(result.getString(3));
				out.print("</td>");
				
				out.print("<td >");
				out.print(result.getString(4));
				out.print("</td>");
				
				out.print("</tr>");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		out.print("</table>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
