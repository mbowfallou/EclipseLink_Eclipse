package com.groupeisi.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.groupeisi.entities.User;

public class UserImpl implements IUser{
	
    private EntityManager em;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("TP1_jpa");
    private EntityTransaction transac;
    
    public UserImpl() {
    	this.em = emf.createEntityManager();    	
    	this.transac = em.getTransaction();
    }

	@Override
	public int saisie(User user) {
		try 
		{
			this.transac.begin();
			this.em.persist(user);
			this.transac.commit();
			
			this.em.close();    
			this.emf.close();
			
			return 1;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return 0;
		}
	}
	
}
