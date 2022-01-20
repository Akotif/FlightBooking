<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Booking</title>
<link rel="stylesheet" href="index23.css">
</head>
<body>

  <%
	    Cookie[] cookies=request.getCookies();
	    String nereden = "", nereye = "";
	    if(session==null){
	    Object email = "Giris Yap";
	    	
	    }
	    if (cookies != null) {
	         for (Cookie cookie : cookies) {
	           if(cookie.getName().equals("nereden")) {
	             nereden = cookie.getValue();
	           }
	           if(cookie.getName().equals("nereye")){
	             nereye = cookie.getValue();
	           }
	          
	        }
	    }
	%>
	
	
		<div id=ana>
			<div id=baslik>
				<img src="logo.png"></img>
				<a class="p2" style="text-decoration:none;">K.K.Traveling</a>
				<form action="uyeol.jsp" method="post">
				<input class="p1" type="submit" value="Uye Ol"> </form>
				<form action="giris.jsp" method="post"> 
				<input class="p1" type="submit" value="Giris Yap"> </form>
				<form action="ucuslar.jsp" method="post"> 
				<input class="p1" type="submit" value="Tum Ucuslar"> </form>
				<form action="index.jsp" method="post"> 
				<input class="p1" type="submit" value="Ucus Ara"> </form> 

			</div>				

			<div id=arama>
			<form action="giris.jsp" method="post">
					<label class=p3>KK. Traveling Ucus Arama</label><br></br>
					<div id=label>
					<label class=p6>Nereden:</label>
					<label class=p6>Nereye:</label>
					<label class=p6>Gidis Tarihi:</label>
					<label class=p6>Koltuk Sayisi:</label>
					</div>				
					<input class="p5"  name="nereden" type="text" value="<%=nereden%>" >
					<input class="p5"  name="nereye" type="text" value="<%=nereye%>" >
					<input class="p5"  name="gidis" type="date"  >
					<select id="koltuk" name="koltuk" class="p8" >
     					<option value="1">1</option>
      					<option value="2">2</option>
      					<option value="3">3</option>
      					<option value="4">4</option>
      					<option value="5">5</option>
    					</select>	
					<input class="p7" type="submit" value="Ucus Ara">
			</form> 

			</div>
	
						
		</div>
	
	
			
</body>
</html>