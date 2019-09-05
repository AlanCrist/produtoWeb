<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>

<body>
		
		<div align="center">
			
			<form action="ContatoController">
				<hr>
					<labe>Nome*:</labe><br/>
					<input type="text" name="nome" id="nome" placeholder="Nome" required/><br/>			
					
					<label>Email</label><br/>
					<input type="text" name="email" id="email" placeholder="Email*" required/><br/><br/><br/>
					
					
					<label>Telefone</label><br/>
					<input type="text" name="telefone" id="telefone" placeholder="Número do telefone*" required/><br/>					
						
					<input type="submit" value="Enviar" />
				<hr>
				
				<br/>
				<a href="home.jsp">Menu</a>
			</form>
		
		</div>
		
</body>
</html>