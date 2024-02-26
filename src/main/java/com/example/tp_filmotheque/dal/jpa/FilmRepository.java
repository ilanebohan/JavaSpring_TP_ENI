package com.example.tp_filmotheque.dal.jpa;

import org.springframework.data.repository.CrudRepository;

import com.example.tp_filmotheque.bo.Film;

public interface FilmRepository extends CrudRepository<Film, Long> {

}
