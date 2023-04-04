package com.example.peoplefor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Post {

	@Id
	// @GeneratedValue
	@SequenceGenerator(name = "seqTest", sequenceName = "TEST_SEQ", initialValue = 101)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTest")
	private int id;
	private String name;
	private String description;
	private String imageUrl, retwitts, heart;

	public Post(int id, String name, String description, String imageUrl, String retwitts, String heart) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
		this.retwitts = retwitts;
		this.heart = heart;
	}

	public Post() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getRetwitts() {
		return retwitts;
	}

	public void setRetwitts(String retwitts) {
		this.retwitts = retwitts;
	}

	public String getHeart() {
		return heart;
	}

	public void setHeart(String heart) {
		this.heart = heart;
	}

}
