package com.tephan.democrudmongo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


import com.tephan.democrudmongo.commons.GenericServiceImpl;
import com.tephan.democrudmongo.dao.api.PersonaRepository;
import com.tephan.democrudmongo.model.Persona;
import com.tephan.democrudmongo.service.api.PersonaServiceApi;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceApi {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	public CrudRepository<Persona, Long>getDao(){
		return personaRepository;
	}

}












