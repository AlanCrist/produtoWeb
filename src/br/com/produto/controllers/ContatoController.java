package br.com.produto.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.produto.model.Contato;
import br.com.produto.model.Fornecedor;
import br.com.produto.regras.FornecedorRN;

@WebServlet("/ContatoController")
public class ContatoController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private FornecedorRN fornecedorService;
       
    public ContatoController() {
    	this.fornecedorService = new FornecedorRN();
    }
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Contato contato = new Contato();
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setTelefone(telefone);
		
		Fornecedor fornecedor = this.fornecedorService.getById(1L);
		this.fornecedorService.update(fornecedor);
		
		
		
		System.out.println(">>>>> CONTATO " + contato.getNome()+ " SALVO COM SUCESSO !");
		
		response.sendRedirect("cadastrarContato.jsp");
	}

}
