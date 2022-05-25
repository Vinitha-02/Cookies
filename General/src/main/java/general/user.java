package general;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class user extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String s= req.getParameter("username");
		String r= req.getParameter("Password");
	    res.setContentType("text/html");  

		PrintWriter out =res.getWriter();
		if(s.equals("vinitha")&&r.equals("12345")) {
			Cookie c= new Cookie("user",s)	; 
			res.addCookie(c);
			res.sendRedirect("pass");
	
			
		}else {
			out.println("Sorry Incorrect username and password");
	       RequestDispatcher rd=req.getRequestDispatcher("Index.html");
	       rd.include(req, res);

			


		}
		

		
	}

}
