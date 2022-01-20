<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Booking</title>
<link rel="stylesheet" href="mystyle5.css">
</head>
<body>
  <%
	    Cookie[] cookies=request.getCookies();
	    String email = "", pass = "",rememberVal="";
	    if (cookies != null) {
	         for (Cookie cookie : cookies) {
	           if(cookie.getName().equals("Email")) {
	             email = cookie.getValue();
	           }
	           if(cookie.getName().equals("Sifre")){
	             pass = cookie.getValue();
	           }
	          
	        }
	    }
	%>
	
		<div id=ana>
			<div id=baslik>
				<img src="logo.png" class="in"></img>
				<form action="admin_giris.jsp" method="post">
				<input class="p1" type="submit" value="Admin Girisi"></form>
			</div>
			
		
			<div id="girisy">
				<img src="logo.png" class="i"></img>
			</div>
			<div id="giris">
			<form action="giris" method="post">
				<label>Giris Yap</label><br></br>
				<p class=p6>E-mail:</p><br></br>
				<input type="text" id="email" name="email" value=<%=email%>>
				<p class=p6>Sifre:</p><br></br>
				<input type="password" id="email" name="pass" value=<%=pass%>><br></br>
				<input class="p0" type="submit" value="Giris Yap">
			</form>
			
			<form action="uyeol.jsp" method="post">
			<input class="p0" type="submit" value="Uye ol">
			</form>
				
			</div>
						
		</div>
	
	
			
</body>
</html>