package com.example.peoplefor.service;

import com.example.peoplefor.model.Signinto;

public interface SignintoService {

	Iterable<Signinto> findAll();

	Signinto save(Signinto signinto);

	void delete(int id);

	Signinto findById(int id);
}
