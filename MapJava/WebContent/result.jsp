<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Distância: <%= request.getAttribute("totalDistance") %><BR>
	Tempo Total: <%= request.getAttribute("totalTime") %><BR>
	Custo Combustível: <%= request.getAttribute("totalFuel") %><BR>
	Custo Pedâgio: <%= request.getAttribute("totalToll") %>
</body>
</html>