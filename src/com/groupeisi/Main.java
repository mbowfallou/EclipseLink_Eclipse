package com.groupeisi;

import com.groupeisi.entities.Role;
import com.groupeisi.entities.User;
import com.groupeisi.repository.IRole;
import com.groupeisi.repository.IUser;
import com.groupeisi.repository.RoleImpl;
import com.groupeisi.repository.UserImpl;

public class Main {

	public static void main(String[] args) {
		
		IUser iUser = new UserImpl();
		IRole iRole = new RoleImpl();
		
		Role role = new Role();
		role.setNom("ROLE_SUPERADMIN");
		
		int result1 = iRole.saisie(role);		
			
		if(result1 == 1) 
			System.out.println("Insertion Role avec succes.\n\n");
		else 
			System.out.println("Insertion Role echouee !!!\n\n");
		
		
		// --------------------------------------------------------
		
		
		User user = new User();
		user.setPrenom("Ousmane");
		user.setNom("GUEYE");
		user.setEmail("ous1@gmail.com");
		user.setPassword("passer");
		user.setEtat(1);
		
		int result2 = iUser.saisie(user);
		
		if(result2 == 1) 
			System.out.println("Insertion User avec succes.");
		else 
			System.out.println("Insertion User echouee !!!");
		
	}

}
