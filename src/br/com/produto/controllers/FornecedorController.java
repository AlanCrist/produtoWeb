package br.com.produto.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.produto.model.Fornecedor;
import br.com.produto.regras.FornecedorRN;


@WebServlet("/FornecedorController")
public class FornecedorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private FornecedorRN fornecedorRN;
   
    public FornecedorController() {
        super();
       this.fornecedorRN = new FornecedorRN();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fornecedor fornecedor = new Fornecedor();
		
		String nome = request.getParameter("nome");
		String cnpj = request.getParameter("cnpj");
		
		fornecedor.setNome(nome);
		fornecedor.setCnpj(cnpj);
		
		
		this.fornecedorRN.addFornecedor(fornecedor);
		System.out.println(">>>>> fornecedor "+fornecedor.getNome()+" salvo com sucesso !!");
		
		response.sendRedirect("cadastrarFornecedor.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
