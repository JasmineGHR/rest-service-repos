package org.mql.biblio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Titles")
public class Document {
	@Id
	private String isbn ;
	private String title ;
	@Column(name="Year_Published")
	private int yearPublisher ;
	@ManyToOne
	@JoinColumn(name="Publisher_ID")
	private Publisher publisher ;
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYearPublisher() {
		return yearPublisher;
	}
	public void setYearPublisher(int yearPublisher) {
		this.yearPublisher = yearPublisher;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Document [isbn=" + isbn + ", title=" + title + ", yearPublisher=" + yearPublisher + ", publisher="
				+ publisher + "]";
	}

	
}
