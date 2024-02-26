package com.example.tp_filmotheque.dal.jpa;

import org.springframework.data.repository.CrudRepository;

import com.example.tp_filmotheque.bo.Film;
import com.example.tp_filmotheque.bo.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
