import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
@WebServlet("/giris1")

public class giris1 extends HttpServlet {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public giris1() {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession(false);
	      if (session != null) {
	         Object email = session.getAttribute("email");
	         if (email != null) {
	        	    try{
	        	      
	        	     }catch(Exception exp){
	        	        System.out.println(exp);
	        	      }
	        	 resp.sendRedirect(req.getContextPath() + "/index1.jsp");
	            
	         }
	      }
	      else {
	         resp.sendRedirect("/giris.jsp");
	      }

}
}

	