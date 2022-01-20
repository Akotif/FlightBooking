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
@WebServlet("/giris_admin")

public class giris_admin extends HttpServlet {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public giris_admin() {
		
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
		
		//int id=Integer.parseInt(req.getParameter("id"));
		
		
		 //PrintWriter writer = resp.getWriter();
         
	        // build HTML code  
	        // return response
	        //writer.println(htmlRespone);
	        
	        try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection kon=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","akif12345");
				Statement st=kon.createStatement();
				  
				ResultSet rs;
				PreparedStatement create = kon.prepareStatement("select * from admin where email_admin = '"+email+"' and sifre_admin = '"+pass+"' " );
		            rs = create.executeQuery();
		            if(rs.next()){		            	 
		            	String ad=rs.getString("ad_admin");
		            	req.setAttribute("ad",ad);
		            	// req.getRequestDispatcher("admin_panel.jsp").forward(req, resp); 
		            	 resp.sendRedirect(req.getContextPath() + "/admin_panel.jsp");
		            }
		            else {
		            	resp.sendRedirect(req.getContextPath() + "/admin_giris.jsp");
		            }
		            }
		            catch(Exception e){
		                e.printStackTrace();
		            }
				

}
}

	