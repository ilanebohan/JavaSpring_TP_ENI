package com.example.tp_filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.tp_filmotheque.bll.MovieManager;
import com.example.tp_filmotheque.bo.Participant;

@Component
public class ConverterParticipant implements Converter<String, Participant> {
	

	@Autowired
	MovieManager manager;

	/*
	 * Source = ID du participant
	 * Return Participant object
	 * */
	@Override
	public Participant convert(String source) {
		Long idParticipant = Long.valueOf(source);
		
		Participant participantChoisi = manager.getParticipant(idParticipant);
		
		return participantChoisi;
	}

}
