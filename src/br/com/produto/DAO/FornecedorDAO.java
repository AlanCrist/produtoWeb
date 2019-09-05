package br.com.produto.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.produto.acess.JPAUtils;
import br.com.produto.model.Fornecedor;

public class FornecedorDAO {
	
	private static JPAUtils instance;
	
	private EntityManager entityManager;
	
	public JPAUtils getInstance() {
		if(instance == null) {
			instance = new JPAUtils();
		}
		
		return instance;
	}
	
	public FornecedorDAO() {
		entityManager = JPAUtils.getEntityManager();
	}
	
	public Fornecedor getById(Long id) {
		return this.entityManager.find(Fornecedor.class, id);
	}
	
	public List<Fornecedor> list(){
		return this.entityManager.createQuery("FROM "+ Fornecedor.class.getName()).getResultList();
	}
	
	public void add(Fornecedor fornecedor) {
		fornecedor.setId(null);
		
		try {
			this.entityManager.getTransaction().begin();
			this.entityManager.persist(fornecedor);
			this.entityManager.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			this.entityManager.getTransaction().rollback();
		}
	}
	
	
	public void update(Fornecedor fornecedor) {
		
		try {
			
				this.entityManager.getTransaction().begin();
				this.entityManager.merge(fornecedor);
				this.entityManager.getTransaction().commit();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			this.entityManager.getTransaction().rollback();
		}
		
	}
	
	public void remove(Long id) {
		try {
			Fornecedor fornecedor = getById(id);
			this.entityManager.remove(fornecedor);
		}
		catch(Exception e) {
			e.printStackTrace();
			this.entityManager.getTransaction().rollback();
		}
	}
	

}
