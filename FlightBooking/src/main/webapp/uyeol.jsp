<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Booking</title>
<link rel="stylesheet" href="mystyle3.css">
</head>
<body>

	
		<div id=ana>
			<div id=baslik>
				<img src="logo.png" class="in"></img>
			</div>
			<div id="girisy">
				<img src="logo.png" class="i"></img>
			</div>
			<div id="giris">
			<form action="uyeol" method="post">
				<label>Uye Ol</label><br></br>
				<input type="text" id="email" name="ad" value="Ad">
				<input type="text" id="email" name="soyad" value="Soyad">
				<input type="tel" id="email" name="tel" value="Telefon">
				<input type="email" id="email" name="email" value="E-Posta">
				<input type="password" id="email" name="pass" value="Sifre"><br></br>
				<input class="p0" type="submit" value="Uye ol">
			</form>	
				
				<form action="giris.jsp" method="post">
				<input class="p0" type="submit" value="Giris Yap">
				</form>

			</div>
						
		</div>
	
	
	
			
</body>
</html>