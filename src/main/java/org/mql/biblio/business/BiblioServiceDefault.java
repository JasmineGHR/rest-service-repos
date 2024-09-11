package org.mql.biblio.business;

import java.util.List;
import java.util.Optional;

import org.mql.biblio.dao.AuthorDao;
import org.mql.biblio.models.Author;
import org.mql.biblio.models.Document;
import org.mql.biblio.repositories.AuthorRepository;
import org.mql.biblio.repositories.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.DispatcherServlet;

@Service
public class BiblioServiceDefault implements BiblioService {
	private AuthorDao authorsDao ;
	@Autowired
	//private AuthorDao authorsDao ;
	private AuthorRepository authorrepository ;
	@Autowired
	private DocumentRepository documentRepository ;
	@Autowired
	@Qualifier("title")
	private String desc ;

	public BiblioServiceDefault() {
		
	}
	public void setAuthorsDao(AuthorDao authorsDao) {
		this.authorsDao = authorsDao;
	}
	public List<Author> authors() {
		//DispatcherServlet()
		//return authorsDao.selectAll();
		return authorrepository.findAll();
	}
	@Override
	public String getTitle() {
		
		return desc; // l'injection by name ensuite by type
	}
	@Override
	public List<Document> documents() {
		// TODO Auto-generated method stub
		return documentRepository.findAll();
	}
	public List<Document> documents(String key) {
		// TODO Auto-generated method stub
		return documentRepository.findByKeyword(key);
	}
	@Override
	public Document document(String isbn) {
		// TODO Auto-generated method stub
		 Optional<Document> doc= documentRepository.findById(isbn);
		 return doc.isPresent() ? doc.get(): null ;
	}

}
