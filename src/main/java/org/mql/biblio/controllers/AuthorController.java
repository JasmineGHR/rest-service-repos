package org.mql.biblio.controllers;



import org.mql.biblio.business.BiblioService;
import org.mql.biblio.models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// est une classe d'action (authorAction)
@Controller
public class AuthorController {
	//@Autowired
	//private ApplicationInfo info ;
	@Autowired
	private BiblioService service ;
	
	
	public AuthorController() {
		
	}
	
	// Methodes d'actions
	@RequestMapping("get-author")
	// en est entain de raisonner rest 
	// End-Point
	@ResponseBody // +controller signifie controllerrRest
	public Author getAuthor(){
		return new Author(101, "Rod Johnson", 1964) ;
				
		
	}
	@GetMapping("get-all-authors")
	public String getAllAuthors(Model model) { // le dernier parametre est le model
		model.addAttribute("authors", service.authors()) ;
		model.addAttribute("title", service.getTitle()) ;
		return "print-authors";
        
		
	}

	
}
