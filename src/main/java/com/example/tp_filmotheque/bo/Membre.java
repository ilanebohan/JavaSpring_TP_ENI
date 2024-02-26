package com.example.tp_filmotheque.bo;

import jakarta.persistence.Entity;

@Entity
public class Membre extends Personne {

	
	String pseudo;
	String password;
	Boolean admin;
	
	
	public Membre(Long id, String name, String firstname, String pseudo, String password, Boolean admin) {
		super(id, name, firstname);
		this.pseudo = pseudo;
		this.password = password;
		this.admin = admin;
	}
	
	public Membre() {
		
	}

	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Boolean getAdmin() {
		return admin;
	}


	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}


	



}
