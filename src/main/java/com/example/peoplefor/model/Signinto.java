package com.example.peoplefor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Signinto {
	@Id
	// @GeneratedValue
	@SequenceGenerator(name = "seqTest", sequenceName = "TEST_SEQ", initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTest")
	private int id;
	private String fullname;
	private String email, contact, gender, password;

	public Signinto() {
	}

	public Signinto(int id, String fullname, String email, String contact, String gender, String password) {
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
