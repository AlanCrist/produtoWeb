package br.com.produto.regras;

import java.util.List;

import br.com.produto.DAO.FornecedorDAO;
import br.com.produto.model.Fornecedor;

public class FornecedorRN {
	
	private FornecedorDAO fornecedorDAO;
	
	public FornecedorRN() {
		this.fornecedorDAO = new FornecedorDAO();
	}
	
	public Fornecedor getById(Long id) {
		return this.fornecedorDAO.getById(id);
	}
	
	public List<Fornecedor> list(){
		return this.fornecedorDAO.list();
	}
	
	public void addFornecedor(Fornecedor fornecedor) {
		this.fornecedorDAO.add(fornecedor);
	}
	
	public void update(Fornecedor fornecedor) {
		this.fornecedorDAO.update(fornecedor);
	}
	
	public void remove(Long id) {
		this.fornecedorDAO.remove(id);
	}
	

}
