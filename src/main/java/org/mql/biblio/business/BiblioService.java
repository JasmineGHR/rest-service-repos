package org.mql.biblio.business;

import java.util.List;


import org.mql.biblio.models.Author;
import org.mql.biblio.models.Document;


public interface BiblioService {
	public List<Author> authors() ;
	public String getTitle() ;
	public List<Document> documents() ;
	public List<Document> documents(String key) ;
	public Document document(String isbn) ;

}
