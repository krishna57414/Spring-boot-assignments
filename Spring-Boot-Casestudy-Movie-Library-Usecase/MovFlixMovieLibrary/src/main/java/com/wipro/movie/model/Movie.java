package com.wipro.movie.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
private String id;
	private String name;
	private int collection;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCollection() {
		return collection;
	}
	public void setCollection(int collection) {
		this.collection = collection;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", collection=" + collection + "]";
	}
	public Movie(String id, String name, int collection) {
		super();
		this.id = id;
		this.name = name;
		this.collection = collection;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}


}
