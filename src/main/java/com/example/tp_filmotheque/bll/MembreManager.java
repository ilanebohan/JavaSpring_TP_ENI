package com.example.tp_filmotheque.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.tp_filmotheque.bo.Membre;
import com.example.tp_filmotheque.dal.IDAOMovie;
import com.example.tp_filmotheque.dal.jpa.GenreRepository;
import com.example.tp_filmotheque.dal.jpa.MembreRepository;

@Component
public class MembreManager {
	
	@Autowired
	public IDAOMovie daoMovie;
	
	@Autowired
	public MembreRepository membreRepo;
	
	public Membre getUser(String login) {
		return daoMovie.getUserByLogin(login);
	}
	
	public Boolean checkPassword(String login, String password)
	{
		// @TODO = Modifier vretour à =false
		Boolean vretour = true;
		Membre connectingUser = getUser(login);
		
		if (connectingUser != null)
		{
			/*BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if (login.equalsIgnoreCase(login) && encoder.matches(password, connectingUser.getPassword())) {
				vretour = true;
			}*/
		}
		
		
		return vretour;
	}

}
