package com.example.tp_filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.tp_filmotheque.bll.MovieManager;
import com.example.tp_filmotheque.bo.Genre;

@Component
public class ConverterGenre implements Converter<String, Genre>{

	@Autowired
	MovieManager manager;
	/*
	 * Source = ID du genre
	 * Return Genre object
	 * */
	@Override
	public Genre convert(String source) {
		Long idGenre = Long.valueOf(source);
		
		Genre genreChoisi = manager.getGenre(idGenre);
		
		return genreChoisi;
	}

}
