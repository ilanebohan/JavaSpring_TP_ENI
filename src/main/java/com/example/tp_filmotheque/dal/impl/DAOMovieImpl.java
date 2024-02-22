package com.example.tp_filmotheque.dal.impl;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.tp_filmotheque.bo.Avis;
import com.example.tp_filmotheque.bo.Film;
import com.example.tp_filmotheque.bo.Genre;
import com.example.tp_filmotheque.bo.Participant;
import com.example.tp_filmotheque.dal.IDAOMovie;

@Profile("impl")
@Component
public class DAOMovieImpl implements IDAOMovie{


	@Override
	public List<Film> consulterFilms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film consulterFilmParId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Genre> consulterGenres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Participant> consulterParticipants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genre consulterGenreParId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Participant consulterParticipantParId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creerFilm(Film film) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String consulterTitreFilm(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void publierAvis(Avis avis, long idFilm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Avis> consulterAvis(long idFilm) {
		// TODO Auto-generated method stub
		return null;
	}

}
