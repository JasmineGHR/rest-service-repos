package org.mql.biblio.models;

import javax.persistence.Column;

//mava persistence Api ()
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.websocket.ClientEndpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component // mere des autres annotations
@Entity
@Table(name="Authors")
public class Author {
	//@Value("200")// l'injection quisque on fait un instancie manuellement
	@Id
	@Column(name="Au_ID")
	private int id ;
	@Column(name="Author")
	private String name ;
	@Column(name="Year_Born")
	private int yearBorn ;
	
	public Author() {
		//System.out.println("## new Author");
		//new Dis
	}
	public Author(int id, String name, int yearBorn) {
		super();
		this.id = id;
		this.name = name;
		this.yearBorn = yearBorn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearBorn() {
		return yearBorn;
	}
	public void setYearBorn(int yearBorn) {
		this.yearBorn = yearBorn;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", yearBorn=" + yearBorn + "]";
	}
	

}
