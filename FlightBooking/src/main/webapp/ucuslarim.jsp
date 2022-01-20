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
				<a class="p2" style="text-decoration:none;">K.K.Traveling</a>
				<form action="giris.jsp" method="post"> 
				<input class="p1" type="submit" value="<%= session.getAttribute("email") %>"> </form>
				<form action="ucuslarim.jsp" method="post"> 
				<input class="p1" type="submit" value="Ucuslarim"> </form>
				<form action="ucuslar.jsp" method="post"> 
				<input class="p1" type="submit" value="Tum Ucuslar"> </form>
				<form action="index1.jsp" method="post"> 
				<input class="p1" type="submit" value="Ucus Ara"> </form> 

			</div>	
			<div id=arama>
			<form action="index1.jsp" method="post">
					<label class=p3>Ucuslarim</label><br></br>
					<div id=label>
					</div>
					<br>
					<label class="p5" ><%= session.getAttribute("nereden") %></label>
					<label class="p5" ><%= session.getAttribute("nereye") %></label>
					<label class="p5" ><%= session.getAttribute("gidis") %></label>
					<input class="p7" type="submit" value="Iptal Et">
			</form> 

			</div>			

						
		</div>
	
	
			
</body>
</html>