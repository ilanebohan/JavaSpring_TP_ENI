package com.example.tp_filmotheque.bo;

public class Genre {
	
	Long id;
	String title;
	
	public Genre() {
		
	}
	public Genre (Long idGenre, String titleGenre)
	{
		this.id = idGenre;
		this.title = titleGenre;
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
	@Override
	public String toString() {
		return "Genre [id=" + id + ", title=" + title + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ "]";
	}

}
