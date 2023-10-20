package com.tephan.democrudmongo.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tephan.democrudmongo.model.Persona;

public interface PersonaRepository extends MongoRepository<Persona, Long>{
	
}
