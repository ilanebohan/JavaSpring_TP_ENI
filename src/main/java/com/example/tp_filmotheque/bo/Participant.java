package com.example.tp_filmotheque.bo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;


import com.example.tp_filmotheque.bo.*;

@Entity
public class Participant extends Personne {
	
	//@ManyToMany(mappedBy = "actors")
	//private List<Film> films;

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
