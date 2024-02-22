package com.example.tp_filmotheque.bo;

public class Participant extends Personne {

	public Participant(Long id, String name, String firstname) {
		super(id, name, firstname);
		// TODO Auto-generated constructor stub
	}
	
	public Participant() {
		
	}
	
	public String getFullName()
	{
		return this.name + " " + this.firstname; 
	}

	
}
