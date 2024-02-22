package com.example.tp_filmotheque.bo;

public abstract class Personne {
	
	Long id;
	String name;
	String firstname;
	
	public Personne(Long id, String name, String firstname) {
		super();
		this.id = id;
		this.name = name;
		this.firstname = firstname;
	}
	
	public Personne() {
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", name=" + name + ", firstname=" + firstname + "]";
	}
	

}
