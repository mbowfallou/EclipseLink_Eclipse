package com.groupeisi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	@Column(length = 100, nullable = false, unique = true)
	private String email;
	@Column(length = 150, nullable = false)
	private String password;
	private int etat;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Role> roles;
	
	private static final long serialVersionUID = 1L;
} 
