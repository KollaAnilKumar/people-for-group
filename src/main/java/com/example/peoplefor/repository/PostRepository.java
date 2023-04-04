package com.example.peoplefor.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.peoplefor.model.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {

}
