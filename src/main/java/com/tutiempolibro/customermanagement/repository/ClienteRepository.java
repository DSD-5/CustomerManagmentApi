package com.tutiempolibro.customermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutiempolibro.customermanagement.model.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

}
