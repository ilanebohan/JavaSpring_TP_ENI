package com.example.tp_filmotheque.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.tp_filmotheque.bo.Film;
import com.example.tp_filmotheque.bo.Genre;
import com.example.tp_filmotheque.bo.Participant;
import com.example.tp_filmotheque.dal.IDAOMovie;

@Component
public class MovieManager {

	@Autowired
	public IDAOMovie daoMovie;
	
	public List<Film> getAllMovies()
	{
		return daoMovie.consulterFilms();
	}

	public Film getDetailsMovie(String id) {
		return daoMovie.consulterFilmParId(Long.valueOf(id));
	}
	
	public List<Genre> getAllGenres()
	{
		return daoMovie.consulterGenres();
	}
	
	public void creerFilm(Film leFilm)
	{
		daoMovie.creerFilm(leFilm);
	}
	
	public Genre getGenre(Long id)
	{
		return daoMovie.consulterGenreParId(id);
	}
	
	public List<Participant> getAllParticipants()
	{
		return daoMovie.consulterParticipants();
	}
	
	public Participant getParticipant(Long id)
	{
		return daoMovie.consulterParticipantParId(id);
	}
	
}
