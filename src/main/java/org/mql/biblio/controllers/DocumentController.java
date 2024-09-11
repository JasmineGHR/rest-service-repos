package org.mql.biblio.controllers;

import java.util.List;

import org.mql.biblio.business.BiblioService;
import org.mql.biblio.models.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documents")
public class DocumentController {
	@Autowired
	private BiblioService service ;
	public DocumentController() {
		// TODO Auto-generated constructor stub
	}
	
	// End-point Rest

	// pour tester /biblio/documents
	@GetMapping
	private List<Document> getAllDocuments(){
		return service.documents() ;
	}
	
	@GetMapping("/keyword/{keyword}")
	private List<Document> getDocumentByKeyword(@PathVariable String keyword){
		return service.documents(keyword) ;// @requestParam id=1	resolution by name le parametre va tere le meme nom 
	}
	
	@GetMapping("/{isbn}") // faut le meme url // pour fair le test de null
	private ResponseEntity<Document> getDocumentByIsbn(@PathVariable String isbn){
		Document doc= service.document(isbn) ;// @requestParam id=1	resolution by name le parametre va tere le meme nom
		if (doc!= null) {
			return ResponseEntity.ok().body(doc) ;
		}
		else{
			return ResponseEntity.notFound().build() ;
		}
	}
}
