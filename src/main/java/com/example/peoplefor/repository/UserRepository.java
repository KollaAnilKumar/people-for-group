package com.example.peoplefor.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.peoplefor.model.Signinto;

public interface UserRepository extends CrudRepository<Signinto, Integer> {

}
