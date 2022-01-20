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
@WebServlet("/ekleme")

public class ekleme extends HttpServlet {
	

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
		String nereden=req.getParameter("nereden");
		String nereye=req.getParameter("nereye");
		String gidis=req.getParameter("gidis");
		String donus=req.getParameter("donus");
		String koltuk=req.getParameter("koltuk");
		String kalkis=req.getParameter("kalkis");
		String inis=req.getParameter("inis");
		
		//int id=Integer.parseInt(req.getParameter("id"));
		System.out.println("basarili"+nereden);
		
		 PrintWriter writer = resp.getWriter();
         
	        //build HTML code
	        String htmlRespone = "<html>";
	        htmlRespone += "<h2>Your username is: " + nereden + "<br/>";       
	        htmlRespone += "</html>";
	        
	     
	       
	         
	        // return response
	        writer.println(htmlRespone);
	        
	        try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection kon=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","akif12345");
				Statement st=kon.createStatement();
				ResultSet rs;
				st.executeUpdate("insert into ucus(nereden_ucus, nereye_ucus, gidis_tarih_ucus, koltuk_ucus, kalkis_ucus, inis_ucus) values('"+nereden+"','"+nereye+"', '"+gidis+"', '"+koltuk+"', '"+kalkis+"', '"+inis+"') ");				     
				   	 HttpSession userSession = req.getSession(true);
		   	         userSession.setMaxInactiveInterval(300);
		   	         userSession.setAttribute("nereden", nereden); 
		   	         userSession.setAttribute("koltuk", koltuk);
		   	         userSession.setAttribute("nereye", nereye); 
		   	         userSession.setAttribute("gidis", gidis); 
		   	         resp.sendRedirect(req.getContextPath() + "/ucuslar_admin.jsp");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        


}
}

	