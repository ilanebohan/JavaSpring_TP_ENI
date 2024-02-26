package com.example.tp_filmotheque.ihm.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tp_filmotheque.bll.MovieManager;
import com.example.tp_filmotheque.bo.Film;
import com.mysql.cj.xdevapi.JsonArray;

@RestController
@RequestMapping("api/v1")
public class MovieRestController {
	
	@Autowired
	MovieManager movieManager;
	
	@GetMapping("movies")
	public List<Film> getAllMovies(){
		return movieManager.getAllMovies();
	}
	
	@GetMapping("movies/{id}")
	public Film getMovieById(@PathVariable("id") String id){
		return movieManager.getDetailsMovie(id);
	}


}
