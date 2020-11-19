package com.tutiempolibro.customermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutiempolibro.customermanagement.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
