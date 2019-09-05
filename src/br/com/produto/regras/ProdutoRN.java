package br.com.produto.regras;

import java.util.List;

import br.com.produto.DAO.ProdutoDAO;
import br.com.produto.model.Produto;

public class ProdutoRN {

private ProdutoDAO produtoDAO;
	
	public ProdutoRN() {
		this.produtoDAO = new ProdutoDAO();
	}
	
	public Produto getById(Long id) {
		return this.produtoDAO.getById(id);
	}
	
	public List<Produto> list(){
		return this.produtoDAO.list();
	}
	
	public void addProduto(Produto produto) {
		this.produtoDAO.add(produto);
	}
	
	public void update(Produto produto) {
		this.produtoDAO.update(produto);
	}
	
	public void remove(Long id) {
		this.produtoDAO.remove(id);
	}
	
}
