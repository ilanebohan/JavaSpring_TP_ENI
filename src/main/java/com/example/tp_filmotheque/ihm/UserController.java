package com.example.tp_filmotheque.ihm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.tp_filmotheque.bo.Film;
import com.example.tp_filmotheque.bo.Membre;

@Controller
@SessionAttributes({"loggedUser"})
public class UserController {
	
	
	@GetMapping(value="/login")
	public String loginForm()
	{
		return "login-page";
	}
	
	/*
	 * Not Used anymore 
	 * 
	@GetMapping(value="/login-session")
	public String loginSession(Model model)
	{
		model.addAttribute("loggedUser", "nantesbretagne@gmail.com");
		
		return "redirect:/";
	}*/
	
	@GetMapping(value="/logout-session")
	public String logout(SessionStatus sessionStatus)
	{
		// vider tte la session
		sessionStatus.setComplete();
		return "redirect:/";
	}
	
	@GetMapping(value="formUser")
	public String formUser(Model model)
	{
		//1 : Données par défaut
		Membre membre = new Membre();
		
		//2 : Envoi au formulaire
		model.addAttribute("monUser", membre);
		
		// Affichage du formulaire
		return "login-page";
	}
	
	@PostMapping(value="formUser")
	public String formUserPost(@ModelAttribute("monUser") Membre membre, Model model) {
		
		System.out.println(membre.toString());
		
		model.addAttribute("loggedUser", membre.getPseudo());
		
		return "redirect:/";
	}

}
