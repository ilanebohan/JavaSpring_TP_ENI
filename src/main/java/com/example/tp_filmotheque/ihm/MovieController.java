package com.example.tp_filmotheque.ihm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.tp_filmotheque.bll.MovieManager;
import com.example.tp_filmotheque.bo.Film;
import com.example.tp_filmotheque.bo.Genre;
import com.example.tp_filmotheque.bo.Membre;
import com.example.tp_filmotheque.bo.Participant;

import jakarta.validation.Valid;

@Controller
@SessionAttributes({"loggedUser"})
public class MovieController {
	
	@Autowired
	MovieManager manager;
	
	@GetMapping(value="/")
	public String home(Model model)
	{
		System.out.println(this.manager.getAllGenres());
		model.addAttribute("genres",this.manager.getAllGenres());
		
		return "index";
	}
	
	@GetMapping(value="/movieList")
	public String listMovies(Model model)
	{
		System.out.println(this.manager.getAllMovies());
		model.addAttribute("films",this.manager.getAllMovies());
		
		return "liste-films";
	}
	
	@GetMapping(value="/movieDetails/{slugMovie}")
	public String detailsMovie(@PathVariable(name="slugMovie") String movieSlug,
			Model model)
	{

		if (model.getAttribute("loggedUser") == null)
		{
			model.addAttribute("loginError","Vous devez être connecté pour effectuer cette action");
			//1 : Données par défaut
			Membre membre = new Membre();
			
			//2 : Envoi au formulaire
			model.addAttribute("monUser", membre);
			return "login-page";
		}
		System.out.println(String.format("Affichage du film n°%s", movieSlug));
		model.addAttribute("film", this.manager.getDetailsMovie(movieSlug));
		
		return "detail-film";
	}
	
	
	// Creation FORM
	@GetMapping(value="formFilm")
	public String formFilm(Model model)
	{
		
		//1 : Données par défaut
		Film film = new Film();
		List<Genre> genres = manager.getAllGenres();
		List<Participant> participants = manager.getAllParticipants();
		
		//2 : Envoi au formulaire
		model.addAttribute("leFilm", film);
		model.addAttribute("lesGenres", genres);
		model.addAttribute("lesParticipants", participants);
		
		// Affichage du formulaire
		return "form-film";
	}
	
	// Update FORM
	@GetMapping(value="formFilm/{filmSlug}")
	public String formFilmUpdate(@PathVariable(name="filmSlug") String slugFilm, Model model) {
		//1 : Données par défaut
		Film film = manager.getDetailsMovie(slugFilm);
		List<Genre> genres = manager.getAllGenres();
		List<Participant> participants = manager.getAllParticipants();
				
		//2 : Envoi au formulaire
		model.addAttribute("leFilm", film);
		model.addAttribute("lesGenres", genres);
		model.addAttribute("lesParticipants", participants);
				
		// Affichage du formulaire
		return "form-film";
	}
	
	@PostMapping(value="formFilm")
	public String formFilmPost(@Valid @ModelAttribute("leFilm") Film film,BindingResult result, Model model) {
		
		if(result.hasErrors())
		{
			return "form-film";
		}
		System.out.println(film.toString());
		manager.creerFilm(film);
		
		return "redirect:/movieList";
	}
	
	
	

}
