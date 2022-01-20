<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Booking</title>
<link rel="stylesheet" href="ucuslarim.css">
</head>
<body>
	
		<div id=ana>
			<div id=baslik>
				<img src="logo.png"></img>
				<a href="admin_panel.jsp" class="p2" style="text-decoration:none;" >K.K.Traveling</a>
				<form action="index.jsp" method="post"> 
				<input class="p1" type="submit" value="Cikis Yap"> </form>
				<form action="ucuslar_admin.jsp" method="post"> 
				<input class="p1" type="submit" value="Ucuslar"> </form>
				<form action="admin_panel.jsp" method="post"> 
				<input class="p1" type="submit" value="Ucus Ekle"> </form> 

			</div>				
			<div id=arama>
			<form action="admin_panel.jsp" method="post">
					<label class=p3>KK. Traveling Ucuslar</label><br></br>
					<div id=label>
					<label class=p6>Gidis Tarihi:</label>
					<label class=p6>Koltuk Sayisi:</label>
					</div>
					<label class="p5" ><%= session.getAttribute("nereden") %></label>
					<label class="p5" ><%= session.getAttribute("nereye") %></label>
					<label class="p5" ><%= session.getAttribute("gidis") %></label>
					<label class="p5" ><%= session.getAttribute("koltuk") %></label>
					<input class="p7" type="submit" value="Ucusu Sil">
			</form> 

			</div>			

						
		</div>
	
	
			
</body>
</html>