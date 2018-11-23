

package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
//import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.Calculation;


public class VolumeCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	 protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // Bean like behaviour (kind of like a Utility Class)
     PrintWriter out = response.getWriter();
     response.setContentType("text/html");
     
     String strscale = request.getParameter("scale");
     Calculation cal = new Calculation();
     
     request.setAttribute("cal", cal);
     // Hash representation of the OUT object
     // --> hexadecimal representation of an object
     // Java Object class hashCode method (0x0..9a..f)
     //Client Browser will render HTML
     
     out.println("<h1>-- Sheridan FAST -- </h1>");
     
     // DUMPS to the Tomcat Servlet Console @Runtime
     System.out.println("Sheridan FAST Console");
     request.getRequestDispatcher("results.jsp")
             .forward(request, response);
 }
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException, ServletException {
		processRequest(req, resp);
	}

	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
	
	
    @Override
    public String getServletInfo() {
        //return super.getServletInfo();
        return "JSP/Servlet wBean using a Deck of Cards as example";
    }

}
