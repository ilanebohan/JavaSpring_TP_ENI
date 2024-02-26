package com.example.tp_filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	Long id;
	
	@Size(min=4,message="Le titre doit posséder 4 caractères min.")
	@NotBlank(message="Titre obligatoire")
	String title;
	
	@Range(min=1, message="L'année doit être supérieure à 0")
	Integer year;
	
	@Range(min=1, message="La durée doit être supérieure à 0")
	Integer length;
	
	String synopsis;
	
	@ManyToOne
	Genre genre;
	
	@ManyToOne
	Participant real;
	
	@ManyToMany
	List<Participant> actors= new ArrayList<Participant>();
	
	@ManyToMany
	List<Avis> avis= new ArrayList<Avis>();
	
	
	public Film(Long id, String title, Integer year, Integer length, String synopsis, Genre genre, Participant real,
			List<Participant> actors) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.length = length;
		this.synopsis = synopsis;
		this.genre = genre;
		this.real = real;
		this.actors = actors;
	}
	
	public Film() {
		
	}
	
	
	public Film(Long id, String title, Integer year, Integer length, String synopsis) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.length = length;
		this.synopsis = synopsis;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}




	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public Participant getRealisateur() {
		// TODO Auto-generated method stub
		return this.real;
		
	}
	
	public Participant getReal() {
		// TODO Auto-generated method stub
		return this.real;
		
	}

	public void setRealisateur(Participant realisator) {
		// TODO Auto-generated method stub
		this.real = realisator;
		
	}
	
	public void setReal(Participant realisator) {
		// TODO Auto-generated method stub
		this.real = realisator;
		
	}

	public List<Participant> getActeurs() {
		return this.actors;
	}
	
	public List<Participant> getActors() {
		return this.actors;
	}
	
	public void setActors(List<Participant> actors) {
		this.actors = actors;
	}
	
	public void addActors(Participant actor) {
		this.actors.add(actor);
	}

	public List<Avis> getAvis() {
		// TODO Auto-generated method stub
		return this.avis;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", title=" + title + ", year=" + year + ", length=" + length + ", synopsis="
				+ synopsis + ", genre=" + genre + ", real=" + real + ", actors=" + actors + ", avis=" + avis + "]";
	}
	

}
