package org.mql.biblio;

import org.mql.biblio.models.Author;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestfulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulServiceApplication.class, args);
	}
	
	@Bean
	public Author a1() {
		return new Author(101, "Rad johnson ", 1964) ;
	}
	@Bean
	public Author a2() {
		return new Author(102, "james Gosling ", 1964) ;
	}
	@Bean
	public Author a3() {
		return new Author(103, "Gamma Erich ", 1964) ;
	}
	@Bean
	public String title() { // son nom
		return "Gestion de Bibliotheque" ; // son valeur
	}
	@Bean
	public String description() { // son nom
		return "Application Console Spring basé sur les annotations" ; // son valeur
	}



}
