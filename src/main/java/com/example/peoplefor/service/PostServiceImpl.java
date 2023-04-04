package com.example.peoplefor.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.peoplefor.model.Post;
import com.example.peoplefor.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	PostRepository postRepository;

	public PostServiceImpl(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	@Override
	public Iterable<Post> findAll() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		return postRepository.save(post);

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		postRepository.deleteById(id);
		;
	}

	@Override
	public Post findById(int theId) {

		Optional<Post> result = postRepository.findById(theId);

		Post thePost = null;

		if (result.isPresent()) {
			thePost = result.get();
		} else {
			// we didn't find the Post
			throw new RuntimeException("Did not find  post id - " + theId);
		}

		return thePost;
	}

}
