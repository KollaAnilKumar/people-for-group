package com.example.peoplefor.service;

import com.example.peoplefor.model.Post;

public interface PostService {

	Iterable<Post> findAll();

	Post save(Post post);

	void delete(int id);

	Post findById(int id);

}
