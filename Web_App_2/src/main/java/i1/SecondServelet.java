package i1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServelet")
public class SecondServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SecondServelet() {
        super(); 
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Successfully interconnected servelet");
		Object attr =(String) request.getAttribute("X");
//		String name = request.getParameter("name");
		System.out.println(attr);
	}

}
