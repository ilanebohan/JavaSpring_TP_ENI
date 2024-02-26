package com.example.tp_filmotheque.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Avis {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	Long id;
	Integer note;
	String commentaire;
	
	@ManyToOne()
	Membre membre;
	
	@ManyToOne()
	Film film;
	
	
	public Avis(Long id, Integer note, String commentaire, Membre membre) {
		super();
		this.id = id;
		this.note = note;
		this.commentaire = commentaire;
		this.membre = membre;
		this.film = film;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNote() {
		return note;
	}
	public void setNote(Integer note) {
		this.note = note;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


	public Membre getMembre() {
		return membre;
	}


	public void setMembre(Membre membre) {
		this.membre = membre;
	}


	public Film getFilm() {
		return film;
	}


	public void setFilm(Film film) {
		this.film = film;
	}
	
	

}
