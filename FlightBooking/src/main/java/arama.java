import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
@WebServlet("/arama")

public class arama extends HttpServlet {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public arama() {
		
	}

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
		int koltuk= Integer.parseInt(req.getParameter("koltuk"));
		System.out.println(koltuk);
		
		//int id=Integer.parseInt(req.getParameter("id"));
			
		 Cookie c3=new Cookie("nereden",nereden);
         Cookie c4=new Cookie("nereye",nereye);
         c3.setMaxAge(5*60);
         c4.setMaxAge(5*60);
         resp.addCookie(c3);
 	     resp.addCookie(c4);
		
		 //PrintWriter writer = resp.getWriter();
         
	        // build HTML code  
	        // return response
	        //writer.println(htmlRespone);
	        
	        try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection kon=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","akif12345");
				Statement st=kon.createStatement();
				  
				ResultSet rs;
				PreparedStatement create = kon.prepareStatement("select count(*) from ucus where nereden_ucus = '"+nereden+"' and nereye_ucus = '"+nereye+"' and gidis_tarih_ucus = '"+gidis+"' and koltuk_ucus >= '"+koltuk+"' " );
		            rs = create.executeQuery();
		            if(rs.next()){
		            	 System.out.println(rs.getInt(1));
		            	  try {
		      				PreparedStatement create1 = kon.prepareStatement("select * from ucus where nereden_ucus = '"+nereden+"' and nereye_ucus = '"+nereye+"' and gidis_tarih_ucus = '"+gidis+"' and koltuk_ucus >= '"+koltuk+"' " );
		      		            rs = create1.executeQuery();
		      		            if(rs.next()){
		      		            	 HttpSession userSession = req.getSession(true);
		      			   	         userSession.setMaxInactiveInterval(300);
		      			   	         userSession.setAttribute("nereden", nereden); 
		      			   	         String koltuk_u = rs.getString("koltuk_ucus");
		      			   	         userSession.setAttribute("koltuk", koltuk_u);
		      			   	         userSession.setAttribute("nereye", nereye); 
		      			   	         userSession.setAttribute("gidis", gidis); 
		      			   	         resp.sendRedirect(req.getContextPath() + "/ucuslar.jsp");
		      			   	       
		      		            }
		      		            else {
		      		            	resp.sendRedirect(req.getContextPath() + "/index1.jsp");
		      		            }
		      		            }
		      		            catch(Exception e){
		      		                e.printStackTrace();
		      		            }
		      	        
		            	 //resp.sendRedirect(req.getContextPath() + "/ucuslar.jsp");
		            }
		            else {
		            	 resp.sendRedirect(req.getContextPath() + "/index1.jsp");
		            }
		            }
		            catch(Exception e){
		                e.printStackTrace();
		            }
	        
	      
	 
            }
            

}
	