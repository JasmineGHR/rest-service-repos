package org.mql.biblio.repositories;

import java.util.List;

import org.mql.biblio.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DocumentRepository extends JpaRepository<Document, String> {
	/*
	 * JPQL : JPA Query Languge base sur l'interrogation des classes et les objets 
	 * au lieu des tbles , C'est une Variante Orienté Objet du langage SQL
	 */
	@Query("SELECT title FROM Document d where d.title LIKE %:keyword%") // rempalcer le keyword pa r le nom qui va etre recherché
	public List<Document> findByKeyword(String keyword);

}
