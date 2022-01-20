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
@WebServlet("/giris")

public class giris extends HttpServlet {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public giris() {
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		 Cookie c1=new Cookie("Email",email);
         Cookie c2=new Cookie("Sifre",pass);
         c1.setMaxAge(5*60);
         c2.setMaxAge(5*60);
         resp.addCookie(c1);
	     resp.addCookie(c2);
	        
	        try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection kon=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","akif12345");
				Statement st=kon.createStatement();
				  
				ResultSet rs;
				PreparedStatement create = kon.prepareStatement("select * from kul where email_kul = '"+email+"' and sifre_kul = '"+pass+"' " );
		            rs = create.executeQuery();
		            if(rs.next()){
		            	
		             HttpSession userSession = req.getSession(true);
		   	         userSession.setMaxInactiveInterval(300);
		   	         userSession.setAttribute("email", email);   
		   	         resp.sendRedirect(req.getContextPath() + "/giris1");
		   	        
		            	
		            	// resp.sendRedirect(req.getContextPath() + "/index.jsp");
		            }
		            else {
		            	resp.sendRedirect(req.getContextPath() + "/giris.jsp");
		            }
		            }
		            catch(Exception e){
		                e.printStackTrace();
		            }
				

}
}

	