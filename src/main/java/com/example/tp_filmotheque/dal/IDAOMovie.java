package com.example.tp_filmotheque.dal;

import java.util.List;

import com.example.tp_filmotheque.bo.Avis;
import com.example.tp_filmotheque.bo.Film;
import com.example.tp_filmotheque.bo.Genre;
import com.example.tp_filmotheque.bo.Participant;


public interface IDAOMovie {

	List<Film> consulterFilms();

	/**
	 * @return film si id correspond
	 * @return null si inconnu
	 */
	Film consulterFilmParId(long id);

	List<Genre> consulterGenres();

	List<Participant> consulterParticipants();

	Genre consulterGenreParId(long id);

	/**
	 * @return participant si id correspond
	 * @return null si inconnu
	 */
	Participant consulterParticipantParId(long id);

	void creerFilm(Film film);

	String consulterTitreFilm(long id);

	void publierAvis(Avis avis, long idFilm);

	List<Avis> consulterAvis(long idFilm);


}
