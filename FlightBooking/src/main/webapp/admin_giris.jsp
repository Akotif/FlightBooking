<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Girisi</title>
<link rel="stylesheet" href="mystyle5.css">
</head>
<body>
	<form action="giris_admin" method="post">
		<div id=ana>
			<div id=baslik>
				<img src="logo.png" class="in"></img>
				<input class="p1" type="submit" value="Admin Girisi">
			</div>
			<div id="girisy">
				<img src="logo.png" class="i"></img>
			</div>
			<div id="giris">
				<label>Giris Yap</label><br></br>
				<p class=p6>E-mail:</p><br></br>
				<input type="text" id="email" name="email" value=>
				<p class=p6>Sifre:</p><br></br>
				<input type="password" id="email" name="pass" value=><br></br>
				<input class="p0" type="submit" value="Giris Yap">
			</div>
						
		</div>
	
	</form>
			
</body>
</html>