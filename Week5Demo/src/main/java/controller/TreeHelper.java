/**
 * @author lscha - lrschanus
 * CIS175 - Fall 2021
 * Sep 20, 2023
 */
package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Tree;

/**
 * @author lscha
 *
 */
public class TreeHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Week5Demo");
	
	public void persist(Tree model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Tree model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Tree.class, model.getRowId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Tree> showAllTrees() {
		EntityManager manager = factory.createEntityManager();
		List<Tree> allItems = manager.createQuery("SELECT i FROM trees i").getResultList();
		manager.close();
		return allItems;
		
	}

	public void update(Tree model) {
		EntityManager manager = factory.createEntityManager();
		Tree dbEntity = manager.find(Tree.class, model.getRowId());
		manager.getTransaction().begin();
		dbEntity.setLatinName(model.getLatinName());
		dbEntity.setCommonName(model.getCommonName());
		dbEntity.setAvgHeight(model.getAvgHeight());
		manager.getTransaction().commit();
		manager.close();
		
	}

	public Tree searchTreeByName(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Tree> query = manager.createQuery("SELECT i FROM trees AS i WHERE i.commonName = :commonName", Tree.class);
		query.setParameter("commonName", oldName);
		Tree dbEntity = query.getSingleResult();
		return dbEntity;
	}
}
