package com.example.tp_filmotheque.dal.jpa;

import org.springframework.data.repository.CrudRepository;

import com.example.tp_filmotheque.bo.Genre;

public interface GenreRepository extends CrudRepository<Genre, Long> {

}
