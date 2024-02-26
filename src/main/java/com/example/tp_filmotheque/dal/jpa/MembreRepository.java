package com.example.tp_filmotheque.dal.jpa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.tp_filmotheque.bo.Membre;
public interface MembreRepository extends CrudRepository<Membre, Long> {
	
	@Query("SELECT m from Membre m where m.pseudo=?1")
	public Membre findByPseudo(String pseudo);
	

}
