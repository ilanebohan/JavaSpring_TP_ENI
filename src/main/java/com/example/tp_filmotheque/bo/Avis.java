package com.example.tp_filmotheque.bo;

public class Avis {
	
	public Avis(Long id, Integer note, String commentaire, Membre membre) {
		super();
		this.id = id;
		this.note = note;
		this.commentaire = commentaire;
		this.membre = membre;	
	}
	
	Long id;
	Integer note;
	String commentaire;
	Membre membre;
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
	
	

}
