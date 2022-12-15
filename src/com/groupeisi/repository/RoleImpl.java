package com.groupeisi.repository;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.groupeisi.entities.Role;

public class RoleImpl implements IRole{
    private EntityManager em;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("TP1_jpa");
    private EntityTransaction transac;
    
    public RoleImpl() {
    	this.em = emf.createEntityManager();    	
    	this.transac = em.getTransaction();
    }

	@Override
	public int saisie(Role role) {
		
		try 
		{
			this.transac.begin();
			this.em.persist(role);
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
