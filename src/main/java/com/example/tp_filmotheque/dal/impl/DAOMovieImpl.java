package com.example.tp_filmotheque.dal.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.tp_filmotheque.bo.Avis;
import com.example.tp_filmotheque.bo.Film;
import com.example.tp_filmotheque.bo.Genre;
import com.example.tp_filmotheque.bo.Membre;
import com.example.tp_filmotheque.bo.Participant;
import com.example.tp_filmotheque.dal.IDAOMovie;
import com.example.tp_filmotheque.dal.jpa.AvisRepository;
import com.example.tp_filmotheque.dal.jpa.FilmRepository;
import com.example.tp_filmotheque.dal.jpa.GenreRepository;
import com.example.tp_filmotheque.dal.jpa.MembreRepository;
import com.example.tp_filmotheque.dal.jpa.ParticipantRepository;

@Profile("impl")
@Component
public class DAOMovieImpl implements IDAOMovie{
	
	@Autowired
	public FilmRepository filmRepo;
	
	@Autowired
	public GenreRepository genreRepo;
	
	@Autowired
	public ParticipantRepository participantRepo;
	
	@Autowired
	public AvisRepository avisRepo;
	
	@Autowired
	public MembreRepository membreRepo;
	
	@Override
	public List<Film> consulterFilms() {
		// TODO Auto-generated method stub
		return (List<Film>) filmRepo.findAll();
	}

	@Override
	public Film consulterFilmParId(long id) {
		// TODO Auto-generated method stub
		return filmRepo.findById(id).get();
	}

	@Override
	public List<Genre> consulterGenres() {
		// TODO Auto-generated method stub
		return (List<Genre>) genreRepo.findAll();
	}

	@Override
	public List<Participant> consulterParticipants() {
		// TODO Auto-generated method stub
		return (List<Participant>) participantRepo.findAll();
	}

	@Override
	public Genre consulterGenreParId(long id) {
		// TODO Auto-generated method stub
		return genreRepo.findById(id).get();
	}

	@Override
	public Participant consulterParticipantParId(long id) {
		// TODO Auto-generated method stub
		return participantRepo.findById(id).get();
	}

	@Override
	public void creerFilm(Film film) {
		// TODO Auto-generated method stub
		System.out.println("CREATION D UN FILM :" + film.toString());
		filmRepo.save(film);
	}

	@Override
	public String consulterTitreFilm(long id) {
		// TODO Auto-generated method stub
		return filmRepo.findById(id).get().getTitle();
	}

	@Override
	public void publierAvis(Avis avis, long idFilm) {
		// TODO Auto-generated method stub
		Film filmSelectionne = consulterFilmParId(idFilm);
		if (filmSelectionne != null) {
			var indexAvis = filmSelectionne.getAvis().size() +1;
			avis.setId((long) indexAvis++);
			filmSelectionne.getAvis().add(avis);
			filmRepo.save(filmSelectionne);
		}
		
	}

	@Override
	public List<Avis> consulterAvis(long idFilm) {
		// TODO Auto-generated method stub
		Film leFilm = consulterFilmParId(idFilm);
		return leFilm.getAvis();
	}
	
	public Membre getUser(long idUser) {
		return membreRepo.findById(idUser).get();
	}
	
	public List<Membre> getAllUsers(){
		return (List<Membre>) membreRepo.findAll();
	}
	
	public Membre getUserByLogin(String login) {
		return membreRepo.findByPseudo(login);
	}

}
