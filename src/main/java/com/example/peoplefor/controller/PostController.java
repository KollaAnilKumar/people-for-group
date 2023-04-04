package com.example.peoplefor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.peoplefor.model.Post;
import com.example.peoplefor.service.PostService;

@RestController

public class PostController {
	@Autowired
	PostService postService;

	public PostController(@Autowired PostService postService) {

		this.postService = postService;
	}

	@GetMapping("/post/{id}")
	public Iterable<Post> getAllPost() {
		return postService.findAll();
	}

	@PostMapping("/post")
	public Post addPost(@RequestBody Post thePost) {

		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		// saveOrUpdate() : insert,update

		thePost.setId(0);

		postService.save(thePost);

		return thePost;
	}

	@PutMapping("/post")
	public Post updateEmployee(@RequestBody Post thePost) {

		postService.save(thePost);

		return thePost;
	}

	@DeleteMapping("/post/{id}")
	public void delete(@PathVariable int id) {

		Post thePost = postService.findById(id);

		// throw exception if null

		if (thePost == null) {
			throw new RuntimeException(" Post id not found - " + id);
		}

		postService.delete(id);

	}

}
