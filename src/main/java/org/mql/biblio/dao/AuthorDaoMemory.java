package org.mql.biblio.dao;

import java.util.List;

import org.mql.biblio.models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // par def le nom de la classe auth..
public class AuthorDaoMemory implements AuthorDao{
	@Autowired // si on veut utiliser setter on doit l'annotesans annoter la prp
	 private List<Author> authors ;
	
	public AuthorDaoMemory() {
		
	}
	/*public void setAuthors(List<Author> authors) {
		this.authors = authors; // la liste va etre cree automatiquement
	}*/

	public List<Author> selectAll() {
		// TODO Auto-generated method stub
		return authors;
	}

	public AuthorDaoMemory(List<Author> authors) {
		this.authors = authors;
	}
	

}
