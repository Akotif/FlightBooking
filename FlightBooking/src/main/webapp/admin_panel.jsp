<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ucus Ekleme</title>
<link rel="stylesheet" href="index21.css">
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
			<form action="ekleme" method="post">
					<label class=p3>KK. Traveling Ucus Ekleme</label><br></br>
					<div id=label>
					<label class=p6>Gidis Tarihi:</label>
					<label class=p6>Koltuk Sayisi:</label>
					</div>
					<input class="p5"  name="nereden"  type="text" 	value="Nereden" required>
					<input class="p5"  name="nereye"  type="text" 	value="Nereye" required>
					<input class="p5"  name="gidis"  type="date" required>
					    <select id="koltuk" name="koltuk" class="p8" required>
     					<option value="50">50</option>
      					<option value="100">100</option>
      					<option value="150">150</option>
      					<option value="200">200</option>
      					<option value="250">250</option>
    					</select>				
					<input class="p5"  name="kalkis"  type="text" 	value="Kalkis Saati" required>
					<input class="p5"  name="inis"    type="text" 	value="Inis Saati" required>
					<br></br>	
					<input class="p7"  name="nereden"  type="submit" value="Ucus Ekle" required>
			</form>
			</div>
	
						
		</div>
	
	
			
</body>
</html>