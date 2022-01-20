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
@WebServlet("/uyeol")

public class uyeol extends HttpServlet {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ad=req.getParameter("ad");
		String soyad=req.getParameter("soyad");
		String tel=req.getParameter("tel");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		//int id=Integer.parseInt(req.getParameter("id"));
		System.out.println("basarili"+ad);
		
		 PrintWriter writer = resp.getWriter();
         
	        // build HTML code
	        String htmlRespone = "<html>";
	        htmlRespone += "<h2>Your username is: " + ad + "<br/>";       
	        htmlRespone += "</html>";
	        
	        resp.sendRedirect(req.getContextPath() + "/giris.jsp");
	       
	         
	        // return response
	        writer.println(htmlRespone);
	        
	        try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection kon=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","akif12345");
				Statement st=kon.createStatement();
				ResultSet rs;
				st.executeUpdate("insert into kul(ad_kul, soyad_kul, telno_kul, email_kul, sifre_kul) values('"+ad+"','"+soyad+"', '"+tel+"', '"+email+"', '"+pass+"') ");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        


}
}

	