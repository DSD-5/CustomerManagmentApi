package com.tutiempolibro.customermanagement.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.tutiempolibro.customermanagement.model.Persona;

public interface ICustomerManagementService {

	public Persona registrarCliente(@RequestBody Persona persona) throws Exception;

	public Persona actualizarCliente(@RequestBody Persona persona) throws Exception;
	
	public Persona obtenerCliente(Integer idpersona) throws Exception;

}
