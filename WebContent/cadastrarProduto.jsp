<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Cadastrar Produto</title>
</head>

<body>
		
		<div align="center">
			
			<form action="ProdutoController">
				<hr>
					<labe>Codigo*:</labe><br/>
					<input type="text" name="codigo" id="codigo" placeholder="Codigo do produto" required/><br/>
					
					<label>Nome*:</label> <br/>
					<input type="text" name="nome" id="nome" placeholder="Nome do produto" required/><br/><br/>
                    
                    <label>Categoria*:</label> <br/>
					<input type="text" name="categoria" id="categoria" placeholder="Categoria do produto" required/><br/><br/>

					<input type="submit" value="Enviar" />
				<hr>
				
				<br/>
				<a href="home.jsp">Menu</a>
			</form>
		
		</div>
		
</body>
</html>