package org.mql.biblio.repositories;

import java.util.List;

import org.mql.biblio.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
/*
 * c'est une no-code repository
 */
public interface AuthorRepository extends JpaRepository<Author, Integer>{
	public List<Author> findByName(String name) ;

}
