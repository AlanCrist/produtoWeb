package br.com.produto.regras;

import java.util.List;

import br.com.produto.DAO.ContatoDAO;
import br.com.produto.model.Contato;


public class ContatoRN {

	private ContatoDAO contatoDAO;
	
	public ContatoRN() {
		this.contatoDAO = new ContatoDAO();
	}
	
	public Contato getById(Long idContato) {
		return this.contatoDAO.getbyId(idContato);
	}
	
	public void addContato(Contato contato) {
		this.contatoDAO.add(contato);
	}
	
	public List<Contato> list(){
		return this.list();
	}
	
	public void update(Contato contato) {
		this.contatoDAO.update(contato);
	}
	
	public void remover(Long idContato) {
		this.contatoDAO.remover(idContato);
	}
	
}
