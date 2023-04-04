package com.example.peoplefor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.peoplefor.model.Signinto;

import com.example.peoplefor.service.SignintoService;

@RestController
public class SignintoController {
	@Autowired
	SignintoService signintoService;

	public SignintoController(@Autowired SignintoService signintoService) {

		this.signintoService = signintoService;
	}

	@GetMapping("/signinto/{id}")
	public Iterable<Signinto> getAllPost() {
		return signintoService.findAll();
	}

	@PostMapping("/signinto")
	public Signinto addSigninto(@RequestBody Signinto theSigninto) {

		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		// saveOrUpdate() : insert,update

		theSigninto.setId(0);

		signintoService.save(theSigninto);

		return theSigninto;
	}

}
