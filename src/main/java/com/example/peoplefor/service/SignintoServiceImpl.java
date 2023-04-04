package com.example.peoplefor.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.peoplefor.model.Signinto;
import com.example.peoplefor.repository.UserRepository;

@Service
public class SignintoServiceImpl implements SignintoService {

	UserRepository userRepository;

	public SignintoServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public Iterable<Signinto> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Signinto save(Signinto signinto) {
		// TODO Auto-generated method stub
		return userRepository.save(signinto);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public Signinto findById(int id) {
		// TODO Auto-generated method stub
		Optional<Signinto> result = userRepository.findById(id);

		Signinto theSigninto = null;

		if (result.isPresent()) {
			theSigninto = result.get();
		} else {
			// we didn't find the Post
			throw new RuntimeException("Did not find   signinto id - " + id);
		}

		return theSigninto;
	}
}
