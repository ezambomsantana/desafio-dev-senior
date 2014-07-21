<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="RouteServlet">
		Origem:
		<table>
			<tr>
				<td>Logradouro:</td>
				<td><input name="originStreet" type="text"></td>
			</tr>
			<tr>
				<td>Número:</td>
				<td><input name="originNumber" type="text"></td>
			</tr>
			<tr>
				<td>Cidade:</td>
				<td><input name="originCity" type="text"></td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td><input name="originState" type="text"></td>
			</tr>
		
		</table>
		<BR>
		Destino:
		
		<table>
			<tr>
				<td>Logradouro:</td>
				<td><input name="destinationStreet" type="text"></td>
			</tr>
			<tr>
				<td>Número:</td>
				<td><input name="destinationNumber" type="text"></td>
			</tr>
			<tr>
				<td>Cidade:</td>
				<td><input name="destinationCity" type="text"></td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td><input name="destinationState" type="text"></td>
			</tr>
		
		</table>		
		
		<input type="submit" value="Enviar" /> 
	</form>	
	
</body>
</html>