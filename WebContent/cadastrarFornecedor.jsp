<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Cadastrar Fornecedor</title>
</head>

<body>
		
		<div align="center">
			
			<form action="FornecedorController">
				<hr>
					<labe>Nome*:</labe><br/>
					<input type="text" name="nome" id="nome" placeholder="Nome" required/><br/>
					
					<label>CNPJ*:</label> <br/>
					<input type="text" name="cnpj" id="cnpj" placeholder="CNPJ" required/><br/><br/>
						
					<input type="submit" value="Enviar" />
				<hr>
				
				<br/>
				<a href="home.jsp">Menu</a>
			</form>
		
		</div>
		
</body>
</html>